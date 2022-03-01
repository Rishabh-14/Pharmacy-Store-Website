package com.genpact.group_1.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.genpact.group_1.model.OrderTable;

public class OrderMapper {
	public static OrderTable mapOrder(ResultSet rs) throws SQLException
	{
		OrderTable order = new OrderTable();
		order.setOrderid(rs.getInt("orderid"));
		order.setQuantity(rs.getInt("Quantity"));
		order.setOrderdate(rs.getString("order date"));
		order.setDeliverydate(rs.getString("Deliverydate"));
		order.setProductid(rs.getInt("Productid"));
		order.setCanceled(rs.getBoolean("Canceled"));
		order.setConfirm(rs.getBoolean("Confirm"));
		order.setBillamount(rs.getInt("Billamount"));
		
		
		
		return order;
	}
}
