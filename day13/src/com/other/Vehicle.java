package com.other;

public class Vehicle {
	 private int vehicalId;
     private String model;
     private String type;
     private double price;
     
     public Vehicle() {
    	 
     }
     public Vehicle(int vehicalId,String model,String type,double price) {
    	 this.vehicalId=vehicalId;
    	 this.model=model;
    	 this.type=type;
    	 this.price=price;
     }
	 public int getVehicalId() {
		 return vehicalId;
	 }
	 public void setVehicalId(int vehicalId) {
		 this.vehicalId = vehicalId;
	 }
	 public String getModel() {
		 return model;
	 }
	 public void setModel(String model) {
		 this.model = model;
	 }
	 public String getType() {
		 return type;
	 }
	 public void setType(String type) {
		 this.type = type;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double price) {
		 this.price=price;
	 }
		 @Override
	     public String toString() {
	    	 return  "Vehical [Vehicalid=" + vehicalId+ ", Model=" + model + ", Type=" + type + ", Price=" + price +"]";
	     }
}
