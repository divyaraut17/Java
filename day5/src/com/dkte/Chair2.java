package com.dkte;

public class Chair2 {
	private int Weight,Height;
    private static int price;
    
    public Chair2(int Weight,int Height) {
    	this.Weight=Weight;
    	this.Height=Height;
    	
    }
    static {//static block
    	price=500;
    	System.out.println("Bolock--1");
    }
    static {//static block
    	price=1000;
    	System.out.println("Bolock--2");
    }
    public static int getPrice() {
    	return price;
    }
    public static void setPrice(int price) {
    	Chair2.price=price;
    	
    }
    public void display() {
    	System.out.printf("weight:%d Height:%d Price:%d\n",this.Weight,this.Height,Chair2.price);
    }
}
