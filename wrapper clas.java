package com.dkte;

public class Demo1 {

	public static void main(String[] args) {
		//Wrapper classes 
		int a = 10;
		Integer i = new Integer(a); 
		
		// type-conversion 
		double b= i.doubleValue(); 
		// Integer => double 
		
		float c = i.floatValue(); 
		// Integer => float 
		
		byte d = i.byteValue(); 
		//Integer => byte 
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		
		// Helper function 
		int max = Integer.max(50, 70); 
		System.out.println("Max : "+max);
	}
		

}
