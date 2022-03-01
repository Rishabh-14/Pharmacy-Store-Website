package com.genpact.group_1.dao;

import java.util.List;

import com.genpact.group_1.model.OrderTable;
import com.genpact.group_1.model.Product;

public interface AdminDao {
	//Product
	//Curd
	boolean addProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(int id);
	//Query
	List<Product> getAllProduct();
	Product searchProductById(int id);
	Product searchProductByName(String name);
	
	//Order
	//Query
	
	List<OrderTable> getAllOrder();
	List<OrderTable> allCompleteOrder();
	
	List<OrderTable> checkPendingOrder();
	boolean acceptOrder(int orderId);
	
	
	
	
	
	

}
