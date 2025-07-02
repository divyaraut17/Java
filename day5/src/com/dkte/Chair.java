package com.dkte;
//Static
public class Chair {
    private int Weight,Height;
    private static int price=500;//field init
    
    public Chair(int Weight,int Height) {
    	this.Weight=Weight;
    	this.Height=Height;
    	
    }
    public static int getPrice() {
    	return price;
    }
    public static void setPrice(int price) {
    	Chair.price=price;
    	
    }
    public void display() {
    	System.out.printf("weight:%d Height:%d Price:%d\n",this.Weight,this.Height,Chair.price);
    }
}
