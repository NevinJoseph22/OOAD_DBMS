package com.ilp03.entity;

public class Employee {
	private int empNo;
	private String firstName;
	private String lastName;
	private String email;
	private String position;
	private int deptId;
	private int managerId;
	private int createdById;
	private int updatedById;
	
	private Performance performance;
	private Department department;
	private Attendance attendance;
	
	public Employee(int empNo, String firstName, String lastName, String email, String position, int deptId,
			int managerId, int createdById, int updatedById, Performance performance, Department department) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.position = position;
		this.deptId = deptId;
		this.managerId = managerId;
		this.createdById = createdById;
		this.updatedById = updatedById;
		this.performance = performance;
		this.department = department;
	}
	
	public Employee(int empNo, String firstName, String lastName, String email, String position, int deptId,
			int managerId, int createdById, int updatedById, Performance performance, Department department, Attendance attendance) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.position = position;
		this.deptId = deptId;
		this.managerId = managerId;
		this.createdById = createdById;
		this.updatedById = updatedById;
		this.performance = performance;
		this.department = department;
		this.attendance= attendance;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getCreatedById() {
		return createdById;
	}
	public void setCreatedById(int createdById) {
		this.createdById = createdById;
	}
	public int getUpdatedById() {
		return updatedById;
	}
	public void setUpdatedById(int updatedById) {
		this.updatedById = updatedById;
	}
	public Performance getPerformance() {
		return performance;
	}
	public void setPerformance(Performance performance) {
		this.performance = performance;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Attendance getAttendance() {
		return attendance;
	}
	public void setAttendance(Attendance attendance) {
		this.attendance=attendance;
	}
	
	
	
}
