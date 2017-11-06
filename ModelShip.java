package edu.albany.hw3.problem1;

public class ModelShip {
	
	private String shipName;
	private String shipYear;
	
	// Constructors
	public ModelShip(String sName, String sYear) {
		shipName = sName;
		shipYear = sYear;
	}
	
	public ModelShip (){
		this("Null", "Null");
	}
	
	//Setters
	public void setShipName(String newShipName){
		shipName = newShipName;
	}
	public void setShipYear(String newShipYear){
		shipYear = newShipYear;
	}
	
	//Getters
	public String getShipName(){
		return shipName;
	}
	
	public String getShipYear(){
		return shipYear;
	}
	
	//Print 
	public String toString() {
		return "Ship Name: " + getShipName() + "\tShip Year: "+ getShipYear();
	}

}
