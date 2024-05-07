package com.ilp03.entity;

public class Department {
	private int departmentId;
	private String name;
	
	public Department(int departmentId, String name) {
		super();
		this.departmentId = departmentId;
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
