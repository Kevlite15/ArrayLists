package edu.albany.hw3.problem1;

public class CargoShip extends ModelShip{
	private int tonnage;
	
	//Constructor
	public CargoShip(){
		init(0);
	}
	public CargoShip(int maxTonnage){
		init(maxTonnage);
	}
	
	public CargoShip(String sName, String sYear, int maxTonnage) {
		super(sName, sYear);
		setTonnage(maxTonnage);
	}
	
	private void init(int maxTonnage){
		tonnage = maxTonnage;
	}

	//Getters
	public int getTonnage() {
		return tonnage;
	}
	
	//Setters
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	//Print
	public String toString() {
		return "Ship Name: " + super.getShipName() + "\tCargo Capcity(Tons): " + getTonnage();
	}
}
