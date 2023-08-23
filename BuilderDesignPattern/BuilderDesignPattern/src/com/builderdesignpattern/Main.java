package com.builderdesignpattern;

public class Main {

	public static void main(String[] args) {
		House house1=new HouseBuilder().setBasementlevel("completed").setIsRoofDone(true).setPaintingLevel("half").setPillarslevel("completed").build();
		System.out.println(house1);
		House house2=new HouseBuilder().setBasementlevel("completed").setIsRoofDone(true).setPillarslevel("completed").build();
		System.out.println(house2);
	}

}
