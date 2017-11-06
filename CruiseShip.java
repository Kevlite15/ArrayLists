package edu.albany.hw3.problem1;

public class CruiseShip extends ModelShip{
	private int maxNumbOfPass;
	
	//Constructor
	public CruiseShip(){
		init(1);
	}
	public CruiseShip(int maxPass){
		init(maxPass);
	}
	
	public CruiseShip(String sName, String sYear, int maxPass) {
		super(sName, sYear);
		setMaxNumbOfPass(maxPass);
	}
	
	private void init(int maxPass){
		maxNumbOfPass = maxPass;
	}

	
	//Getters
	public int getMaxNumbOfPass() {
		return maxNumbOfPass;
	}
	
	//Setters
	public void setMaxNumbOfPass(int maxNumbOfPass) {
		this.maxNumbOfPass = maxNumbOfPass;
	}
	
	//Print
	public String toString() {
		return "Ship Name: " + super.getShipName() + "\tMaximum Number of Passengers: "+ getMaxNumbOfPass();
	}
}
