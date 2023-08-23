package com.builderdesignpattern2;

public class StudentBuilder {
	
	  String id;
	  String name;
	  int standard;
	  String fatherName;
	  String lastName;   //optional
	  String address;	   //optional
	  
	  
	public StudentBuilder setId(String id) {
		this.id = id;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder setStandard(int standard) {
		this.standard = standard;
		return this;
	}
	public StudentBuilder setFatherName(String fatherName) {
		this.fatherName = fatherName;
		return this;
	}
	public StudentBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public StudentBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	  
	  
	public Student build() {
		Student student=new Student(this);
		validate(student);
		return student;
	}
	private void validate(Student student) {
		if(id==null || id.length()==0) {
			throw new IllegalArgumentException("id can not be null or empty");
		}
		
		if(this.standard>10) {
			throw new IllegalArgumentException("student should be under 10th class");
		}
		if(fatherName==null || fatherName.length()==0) {
			throw new IllegalArgumentException("father name can not be null or empty");
		}
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException("name can not be null or empty");
		}
		
	}
	  

}
