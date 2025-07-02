package com.dkte;

public class Demo3 {

	public static void main(String[] args) {
		// converting primitive to wrapper -> Boxing 
				int i = 10;
				Integer j = new Integer(i); // Boxing 
				Integer k = i; // auto-boxing  
				System.out.println("j:"+j);
				System.out.println("k:"+k);
				//Converting wrapper to primitive -> Unboxing 
				Integer x = new Integer(10); 
				int y = x.intValue(); // Unboxing 
				int z = x; // auto-unboxing 
				System.out.println("y:"+y);
				System.out.println("z:"+z);
	}

}
