package com.genpact.group_1.model;

public class Category {
	private int categoryid ;
	private String  name ;
	
	public Category() {
		super();
		
	}

	public Category(int categoryid, String name) {
		super();
		this.categoryid = categoryid;
		this.name = name;
	}


	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		
	


}
