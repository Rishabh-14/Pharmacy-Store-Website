package com.genpact.group_1.model;

public class OrderTable {
     private int orderid;
     private int productid;
     private String customerid;
     private int quantity;
     private String orderdate;
     private String deliverydate;
     private boolean canceled;
     private boolean confirm;
     private int billamount;
	public OrderTable() {
		super();
	}
	
	public OrderTable(int orderid, int productid, String customerid, int quantity, String orderdate, String deliverydate,
			boolean canceled, boolean confirm, int billamount) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.customerid = customerid;
		this.quantity = quantity;
		this.orderdate = orderdate;
		this.deliverydate = deliverydate;
		this.canceled = canceled;
		this.confirm = confirm;
		this.billamount = billamount;
	}

	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	public boolean isCanceled() {
		return canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
	public boolean isConfirm() {
		return confirm;
	}
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	public int getBillamount() {
		return billamount;
	}
	public void setBillamount(int billamount) {
		this.billamount = billamount;
	}
     
     
     
}
