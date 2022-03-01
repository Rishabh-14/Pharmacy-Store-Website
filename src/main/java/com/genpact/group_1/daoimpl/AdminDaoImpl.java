package com.genpact.group_1.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;


import com.genpact.group_1.dao.AdminDao;
import com.genpact.group_1.mapper.ProductMapper;
import com.genpact.group_1.mapper.RowMapperOrder;
import com.genpact.group_1.mapper.RowMapperProduct;
import com.genpact.group_1.model.OrderTable;
import com.genpact.group_1.model.Product;

public class AdminDaoImpl implements AdminDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public boolean addProduct(Product product) {
		try {
			String query = "insert into product(name,subcategoryid,description,units,price)"
					+ " values(?,?,?,?,?)";
			int count = jdbcTemplate.execute(query,new PreparedStatementCallback<Integer>(){

				@Override
				public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					
					ps.setString(1, product.getName());
					ps.setInt(2, product.getSubcategoryid());
					ps.setString(3, product.getDescription());
					ps.setInt(4, product.getUnits());
					ps.setInt(5, product.getPrice());
					
					return ps.executeUpdate();
				}
				
			});
			if(count > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		try {
			String query = "update product set name= ?,subcategoryid = ?,description = ?,units = ?,price = ? "
					+ "where productid = ?";
			int count = jdbcTemplate.execute(query,new PreparedStatementCallback<Integer>(){

				@Override
				public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					
					ps.setString(1, product.getName());
					ps.setInt(2, product.getSubcategoryid());
					ps.setString(3, product.getDescription());
					ps.setInt(4, product.getUnits());
					ps.setInt(5, product.getPrice());
					ps.setInt(6, product.getProductid());
					
					return ps.executeUpdate();
				}
				
			});
			if(count > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

		

	@Override
	public boolean deleteProduct(int id) {
		try {
			String query = "delete from product where productid = ?";
			int count = jdbcTemplate.execute(query,new PreparedStatementCallback<Integer>(){

				@Override
				public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					
					ps.setInt(1, id);
					
					return ps.executeUpdate();
				}
				
			});
			if(count > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> lst = new ArrayList<Product>();
		try {
			String query = "SELECT * FROM product";
			lst = jdbcTemplate.query(query,new RowMapperProduct());
		} catch (Exception e) {
			e.printStackTrace();
			lst.clear();
		}
		return lst;
	}
	
	@Override
	public Product searchProductById(int id) {
		Product product = null;
		try {
			String query = "select * from product where productid = ? ";
			return product = jdbcTemplate.execute(query,new PreparedStatementCallback<Product>() {

				@Override
				public Product doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					Product pr = null;
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					
					
					if(rs.isBeforeFirst()) {
						rs.next();
						pr = ProductMapper.mapProduct(rs);
					}
					return pr;
					
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Product searchProductByName(String name) {
		Product product = null;
		try {
			String query = "select * from product where name like ?";
			return product = jdbcTemplate.execute(query,new PreparedStatementCallback<Product>() {

				@Override
				public Product doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					Product product = null;
					
					ps.setString(1, name);;
					
					ResultSet rs = ps.executeQuery();
					if(rs.isBeforeFirst()) {
						rs.next();
						product = ProductMapper.mapProduct(rs);
					}
					return product;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<OrderTable> getAllOrder() {
			List<OrderTable> lst = new ArrayList<>();
		
		String query = "select o.orderid, p.name, o.quantity, o.orderdate, o.deliverydate, c.customerid ,o.billamount"
				+ "from ordertable o,product p,customer c "
				+ "where o.customerid like c.customerid and o.productid = p.productid";
		
		try {
		   lst=jdbcTemplate.query(query, new RowMapperOrder());
		}
		catch (Exception e) {
			e.printStackTrace();
			lst.clear();
			return lst;
		}
		
		return lst;
	}

	@Override
	public List<OrderTable> allCompleteOrder() {
		List<OrderTable> lst = new ArrayList<>();
		
		String query ="SELECT * FROM ordertable where canceled = 0 and confirm = 1";
			
			try {
			 lst=jdbcTemplate.query(query, new RowMapperOrder() );
			}
			catch (Exception e) {
				e.printStackTrace();
				lst.clear();
				return lst;
			}
			
			return lst;
	}

	@Override
	public List<OrderTable> checkPendingOrder() {
		
		List<OrderTable> lst = new ArrayList<>();
		
		String query = "select o.orderid, p.name, o.quantity, o.orderdate, o.deliverydate, c.customerid ,o.billamount "
				+ "from ordertable o,product p,customer c"
				+ " where o.customerid like c.customerid and o.productid = p.productid and o.canceled = 0 and o.confirm = 0";
		
		try {
		
		lst = jdbcTemplate.query(query, new RowMapperOrder());
		
		} catch (Exception e) {
			e.printStackTrace();
			lst.clear();
			return lst;
		}
		
		return lst;
	}
	@Override
	public boolean acceptOrder(int orderId) {
		
		boolean b = false;
		String query = "update  ordertable set confirm = 1 where orderid = ? and canceled = 0 and confirm =  0";
		
		try {
			b = jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
				
				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps) 
						throws SQLException, DataAccessException {
					
					ps.setInt(1,orderId);
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.isBeforeFirst())
						return true;
					else
						return false;
				}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return b;
	}
}