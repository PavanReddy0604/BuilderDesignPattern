package com.builderdesignpattern;

public class HouseBuilder {

	String basementlevel;
	String pillarslevel;
	Boolean isRoofDone;
	String paintingLevel;

	public HouseBuilder setBasementlevel(String basementlevel) {
		this.basementlevel = basementlevel;
		return this;
	}

	public HouseBuilder setPillarslevel(String pillarslevel) {
		this.pillarslevel = pillarslevel;
		return this;
	}

	public HouseBuilder setIsRoofDone(Boolean isRoofDone) {
		this.isRoofDone = isRoofDone;
		return this;
	}

	public HouseBuilder setPaintingLevel(String paintingLevel) {
		this.paintingLevel = paintingLevel;
		return this;
	}

	public House build() {
		return new House(this);
	}

}
