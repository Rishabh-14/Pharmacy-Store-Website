package com.genpact.group_1.dao;

import java.util.List;

import com.genpact.group_1.model.Product;

public interface CustomerDao {
	
	//Product
	
	List<Product> getAllProduct();
	List<Product> searchProduct(String str);
	
	
	//Order
	boolean addOrderByQuantity(String productName,int unit,String customerId);
	boolean cancelOrder(int orderId);
	

}