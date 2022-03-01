package com.genpact.group_1.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.genpact.group_1.model.Product;

public class RowMapperProduct implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductid(rs.getInt("productid"));
		product.setName(rs.getString("name"));
		product.setDescription(rs.getString("description"));
		product.setPrice(rs.getInt("price"));
		product.setUnits(rs.getInt("units"));
		
		return product;
	}

}
