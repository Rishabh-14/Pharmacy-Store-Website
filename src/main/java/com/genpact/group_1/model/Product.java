package com.genpact.group_1.model;

public class Product {
 private int productid;
 private String name;
 private int subcategoryid;
 private String description;
 private int units;
 private int price ;
 
public Product() {
	super();
}

public Product(int productid, String name, int subcategoryid, String description, int units, int price) {
	super();
	this.productid = productid;
	this.name = name;
	this.subcategoryid = subcategoryid;
	this.description = description;
	this.units = units;
	this.price = price;
}

public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSubcategoryid() {
	return subcategoryid;
}
public void setSubcategoryid(int subcategoryid) {
	this.subcategoryid = subcategoryid;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getUnits() {
	return units;
}
public void setUnits(int units) {
	this.units = units;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
 
 @Override
	public String toString() {
		return name;
	}
 
}
