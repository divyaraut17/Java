package com.dkte;

public class Program {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.display();
		
		Date d2=new Date(2,2,2000);
		d2.display();
		
		Emp e = new Emp(1, "Ketan", 1000.00, d2); 
		 e.display();
		
		Emp em = new Emp();
		em.accept();
		em.display();
	}

}
