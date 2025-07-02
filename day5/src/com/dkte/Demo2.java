package com.dkte;

public class Demo2{

	public static void main(String[] args) {
		  Human[] arr = new Human[4];
		  /*Human[] arr1 = {
				  new Human(31,56,155),
				  new Human(12,45,145),
				  new Human(45,89,255),
				  new Human(67,45,321),
				  
				  
		  };*/
		  arr[0]= new Human(31,56,155);
		  arr[1]=new Human(12,45,145);
		  arr[2]=new Human(45,89,255);
		  arr[3]= new Human(67,45,321);
        for(int i=0;i<arr.length;i++) {
        arr[i].display();
	}
	}

}
