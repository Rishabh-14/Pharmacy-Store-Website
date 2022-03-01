package com.genpact.group_1.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.genpact.group_1.mapper.ProductMapper;
import com.genpact.group_1.mapper.RowMapperProduct;
import com.genpact.group_1.dao.CustomerDao;
import com.genpact.group_1.model.OrderTable;
import com.genpact.group_1.model.Product;

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProduct() {
		List<Product> lst = new ArrayList<>();
		String sql = "SELECT * FROM product";
		try {

			lst = jdbcTemplate.query(sql, new RowMapperProduct());

		} catch (Exception e) {
			e.printStackTrace();
			lst.clear();
			return lst;
		}

		return lst;
	}

	@Override
	public List<Product> searchProduct(String str) {
		List<Product> lst = new ArrayList<Product>();
		
		//Query to find product form product table with category name only
		String catsql = "Select p.productid, p.name,"
				+ " p.description, p.price, p.units"
				+ " from category c,subcategory s,product p"
				+ " where c.name like ? and"
				+ " c.categoryid = s.categoryid and "
				+ "s.subcategoryid = p.subcategoryid";
		
		//Query to find product form product table with subcategory name only
		String subsql = "Select p.productid,p.name,p.description,"
				+ " p.price,p.units from subcategory s,product p"
				+ " where s.name like 'skincare' and "
				+ "s.subcategoryid = p.subcategoryid";
		
		
		//Query to find product form product table with product name only
		String prdsql = "Select p.productid,p.name,p.description,"
				+ "	p.price,p.units from product p"
				+ "  where p.name like 'peanuts butter";
		try {
			lst = jdbcTemplate.query(catsql, new RowMapperProduct(), str);
			if (lst.isEmpty()) {
				lst = jdbcTemplate.query(subsql, new RowMapperProduct(), str);
			}
			if (lst.isEmpty()) {
				lst = jdbcTemplate.query(prdsql, new RowMapperProduct(), str);
			}

		} catch (Exception e) {
			e.printStackTrace();
			lst.clear();
			return lst;
		}
		return lst;
	}

	@Override
	public boolean addOrderByQuantity(String productName, int unit, String customerId) {

		String query1 = "SELECT * FROM product where name like ?";

		// find Product details using its name for placing order

		Product product = null;
		try {

			product = jdbcTemplate.execute(query1, new PreparedStatementCallback<Product>() {

				@Override
				public Product doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

					ps.setString(1, productName);

					ResultSet rs = ps.executeQuery();

					if (rs.isBeforeFirst()) {
						rs.next();
						Product pr = ProductMapper.mapProduct(rs);

						return pr;
					} else
						return null;
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Finding Current Date
		long millis = System.currentTimeMillis();
		Date date = new java.sql.Date(millis);

		// Finding Delivery date after 4 days
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(sdf.parse(date.toString()));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		cal.add(Calendar.DAY_OF_MONTH, 4);
		String deliveryDate = sdf.format(cal.getTime());

		// Making order object and setting each values

		OrderTable order = new OrderTable();

		if (product != null) {
			order.setProductid(product.getProductid());
			order.setBillamount(unit * product.getPrice());
		}
		order.setCustomerid(customerId);
		order.setQuantity(unit);
		order.setOrderdate(date.toString());
		order.setDeliverydate(deliveryDate);

		// Insertion of Order Details in database
		boolean b = false;
		String query2 = "insert into "
				+ "ordertable(productid,customerid,quantity,"
				+ "orderdate,deliverydate,billamount) values"
				+ "(?,?,?,?,?,?)";

		int count = jdbcTemplate.execute(query2, new PreparedStatementCallback<Integer>() {

			@Override
			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

				ps.setInt(1, order.getProductid());
				ps.setString(2, order.getCustomerid());
				ps.setInt(3, order.getQuantity());
				ps.setDate(4, (java.sql.Date) date);
				ps.setDate(5, (java.sql.Date) cal.getTime());
				ps.setInt(6, order.getBillamount());
				return ps.executeUpdate();
			}
		});

		if (count > 0)
			b = true;

		return b;
	}

	@Override
	public boolean cancelOrder(int orderId) {

		boolean b = false;
		String query = "update ordertable set canceled=1 where orderid=? and canceled=0 and confirm=0";
		try {

			int count = jdbcTemplate.execute(query, new PreparedStatementCallback<Integer>() {

				@Override
				public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					ps.setInt(1, orderId);
					return ps.executeUpdate();
				}
			});

			if (count > 0)
				b = true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return b;
	}

}