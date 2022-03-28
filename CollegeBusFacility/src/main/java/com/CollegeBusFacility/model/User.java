package com.CollegeBusFacility.model;

public class User {
	private int id;
	private String name;
	private String dob;
	
	private String department;
	private String phonenum;
	private String address;
	private String role;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String dob, String department, String phonenum, String address, String role,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.department = department;
		this.phonenum = phonenum;
		this.address = address;
		this.role = role;
		this.password = password;
	}

}
