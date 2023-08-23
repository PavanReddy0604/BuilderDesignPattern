package com.builderdesignpattern2;

public class Student {
	
	private String id;
	private String name;
	private int standard;
	private String fatherName;
	private String lastName;   //optional
	private String address;	   //optional
	
	
	
	public Student(StudentBuilder sb) {
		this.id=sb.id;
		this.name=sb.name;
		this.standard=sb.standard;
		this.fatherName=sb.fatherName;
		this.lastName=sb.lastName;
		this.address=sb.address;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getStandard() {
		return standard;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", fatherName=" + fatherName
				+ ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	
	

}
