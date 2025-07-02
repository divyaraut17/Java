package com.dkte;

public class Dem03 {

	public static void main(String[] args) {
		Chair c1 = new Chair(30,40);
		Chair c2 = new Chair(50,40);
		
		c1.display();
		c2.display();
	
	//Chair.price=1000;//price is private so are not access outside the class
	 Chair.setPrice(1000);
	 System.out.println("Updated price:"+Chair.getPrice());
	 c1.display();
	 c2.display();
	 
	}

}
