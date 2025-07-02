package com.dkte;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Converting primitive to wrapper --> Boxing 
				int a = 10;
				Integer b = new Integer(a); // Boxing 
				
				//Converting wrapper to primitive -> unboxing 
				int c = b.intValue();   
				System.out.println("c:"+c);

	}

}
