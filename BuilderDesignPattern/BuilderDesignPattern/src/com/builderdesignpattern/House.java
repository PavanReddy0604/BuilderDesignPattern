package com.builderdesignpattern;

public class House {
	
	private String basementlevel;
	private String pillarslevel;
	private Boolean isRoofDone;
	private String paintingLevel;
	
	
	public House (HouseBuilder hb) {
		this.basementlevel=hb.basementlevel;
		this.isRoofDone=hb.isRoofDone;
		this.paintingLevel=hb.paintingLevel;
		this.pillarslevel=hb.pillarslevel;
		
	}
	
	
	
	@Override
	public String toString() {
		return "House [basementlevel=" + basementlevel + ", pillarslevel=" + pillarslevel + ", isRoofDone=" + isRoofDone
				+ ", paintingLevel=" + paintingLevel + "]";
	}



	public String getBasementlevel() {
		return basementlevel;
	}
	public String getPillarslevel() {
		return pillarslevel;
	}
	public Boolean getIsRoofDone() {
		return isRoofDone;
	}
	public String getPaintingLevel() {
		return paintingLevel;
	}
	
	
	
	

}
