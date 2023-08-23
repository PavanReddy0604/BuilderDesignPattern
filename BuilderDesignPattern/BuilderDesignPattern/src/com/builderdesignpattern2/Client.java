package com.builderdesignpattern2;

public class Client {

	public static void main(String[] args) {
		
		Student s1 = new StudentBuilder().setId("123").setName("kavan").setAddress("kadapa").setFatherName("ramanjula reddy")
				.setLastName("reddy").build();
		System.out.println(s1);
		try {
		Student s2 = new StudentBuilder().setId("").setName("kavan").setAddress("kadapa").setFatherName("ramanjula reddy")
				.setLastName("reddy").build();
		System.out.println(s2);
		}
		catch(IllegalArgumentException e) {
			//System.out.println("validation vaiolated ");
			e.printStackTrace();
		}
		try {
		Student s3 = new StudentBuilder().setId("123").setName(null).setAddress("kadapa").setFatherName("ramanjula reddy")
				.setLastName("reddy").build();
		System.out.println(s3);
		}
		catch(IllegalArgumentException e) {
		//	System.out.println("validation vaiolated ");
			e.printStackTrace();
		}
		try {
		Student s4 = new StudentBuilder().setId("123").setName("kavan").setAddress("kadapa").setFatherName("")
				.setLastName("reddy").build();
		System.out.println(s4);
		}
		catch(IllegalArgumentException e) {
			//System.out.println("validation vaiolated ");
			e.printStackTrace();
		}
		
		Student s5 = new StudentBuilder().setId("1234").setName("kavan").setAddress("kadapa").setFatherName("ramanjula reddy")
				.setLastName("reddy").build();
		System.out.println(s5);
	}

}
