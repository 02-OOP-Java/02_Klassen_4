package com.cc.java;

public class Yard {

	public static void main(String[] args) {
		
		// Cat --> Klasse
		// cat --> Instanz / Objekt 		
		

		// erste Instanz (Objekt)
		Cat cat1 = new Cat("Grizabella", "white", 29);
		cat1.tellYourName();
		cat1.tellYourFurColor();
		cat1.tellYourAge();
		cat1.tellYourAddress();
		
		System.out.println("----------------");
		
		// zweite Instanz (Objekt)
		Cat cat2 = new Cat("Alonzo", "black", 35);
		cat2.tellYourName();
		cat2.tellYourFurColor();
		cat2.tellYourAge();
		cat2.tellYourAddress();
	}

}
