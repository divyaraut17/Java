package com.app.fruit;

public class Fruits {
   private String name;
	private String colour;
	private double weight;
   private boolean isFresh;
	
	public Fruits(String name,String colour,double weight) {
		this.name=name;
		this.colour=colour;
		this.weight=weight;
		this.isFresh=true;
		}
	public String getName() {
		return name;
	}
	public String getColour() {
		return colour;
	}
	public double getWeight() {
		return weight;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean fresh) {
		isFresh=fresh;
	}
	
	public String taste() {
		return "Fruit Taste";
		
	}
	@Override
	public String toString() {
		return "Name: "+name+", Colour: "+colour+", Weight: "+weight;
	}
	
	
}
