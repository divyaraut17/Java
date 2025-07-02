package com.dkte;

public class Demo5 {

	public static void main(String[] args) {
		Circle c1=new Circle(3.1);
		//System.out.println("Area:"+c1.calArea());
		//System.out.println("Peri:"+c1.calPeri());
		
		//double rad =5.1;
		//c1.setRadius(rad);
		//System.out.println("Area:"+c1.calArea());
		//System.out.println("Peri:"+c1.calPeri());
		
		final Circle c2=new Circle(4.0);//reference is final
		System.out.println("Area:"+c2.calArea());
		System.out.println("Peri:"+c2.calPeri());
		c2.setRadius(6.0);
       //c2 = null; // we cannot modify reference is final 
		
		final int x = 10; // final local variable 
		
		//x = 20; // NOT OK ( final field once init cannot be modified)  
	}
	
}


