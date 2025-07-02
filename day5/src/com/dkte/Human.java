package com.dkte;

public class Human {
    private int age,weight,Height;
    //parameterized c
    public Human(int age,int weight,int Height) {
    	this.age=age;
    	this.weight=weight;
    	this.Height=Height;
    	
    }
    
	public void display() {
		System.out.printf("\nAge:%d\n Weight=%d\n Height=%d\n",age,weight,Height);

	}

}
