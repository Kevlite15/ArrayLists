package edu.albany.hw3.problem1;

public class test {
	
	public static void main(String[] args) {
		/*
		ModelShip x = new ModelShip("Kevin", "1994");
		x.getShipName();
		x.getShipYear();
		System.out.println(x);
		x.setShipName("yolo");
		x.setShipYear("1996");
		System.out.println(x);
		CruiseShip y = new CruiseShip("Kevin","1994",120);
		System.out.println(y.getShipName());
		System.out.println(y.getShipYear());
		System.out.println(y.getMaxNumbOfPass());
		System.out.println(y);
		CargoShip z = new CargoShip("Swag","2000",6000);
		System.out.println(z.getShipName());
		System.out.println(z.getShipYear());
		System.out.println(z.getTonnage());
		System.out.println(z);
		*/
		
		//Creating Objects
		ModelShip x = new ModelShip("SS.Kevin", "1994");
		CruiseShip y = new CruiseShip("SS.Singh","2014",120);
		CargoShip z = new CargoShip("SS.Test","2000",6000);
		
		//Creating ModelShip ArrayList
		ModelShip [] shipArray = new ModelShip[3];
		
		//Adding Ships to ArrayList
		shipArray[0] = x;
		shipArray[1] = y;
		shipArray[2] = z;
		
		//Iterating though ArrayList and Printing using each objects toString method.
		for ( ModelShip a : shipArray){
			System.out.println(a);
			
		}
	}

}
