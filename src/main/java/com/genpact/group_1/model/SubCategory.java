package com.genpact.group_1.model;

public class SubCategory {
	private int subcategoryid;
	private String name;
	
	public SubCategory() {
		super();
		
	}
	

	public SubCategory(int subcategoryid, String name) {
		super();
		this.subcategoryid = subcategoryid;
		this.name = name;
	}


	public int getSubcategoryid() {
		return subcategoryid;
	}

	public void setSubcategoryid(int subcategoryid) {
		this.subcategoryid = subcategoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
