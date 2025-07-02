package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Shape rect = new Rectangle(10.00, 2.00); 
		System.out.println("Area : "+rect.calcArea());
		System.out.println("Peri : "+rect.calcPeri());
		
		Shape c = new Circle(3.1); 
		System.out.println("Area : "+c.calcArea());
		System.out.println("Peri : "+c.calcPeri());
		
		Shape s = new Square(5.1); 
		System.out.println("Area : "+s.calcArea());
		System.out.println("Peri : "+s.calcPeri());
	}

}
