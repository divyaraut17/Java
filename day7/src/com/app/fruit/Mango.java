package com.app.fruit;

class Mango extends Fruits{
	public Mango(String name,String colour,double weight) {
		super(name,colour,weight);
		
		}
	@Override
	public String taste() {
		return "Sweet";
	}
}