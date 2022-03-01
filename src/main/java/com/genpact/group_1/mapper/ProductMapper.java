package com.genpact.group_1.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.genpact.group_1.model.Product;

public class ProductMapper {
	
	public static Product mapProduct(ResultSet rs) throws SQLException
	{
		Product product = new Product();
		product.setProductid(rs.getInt("productid"));
		product.setName(rs.getString("name"));
		product.setSubcategoryid(rs.getInt("subcategoryid"));
		product.setDescription(rs.getString("description"));
		product.setPrice(rs.getInt("price"));
		product.setUnits(rs.getInt("units"));
		
		return product;
	}

}
