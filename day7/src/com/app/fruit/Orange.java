package com.app.fruit;

class Orange extends Fruits{
	public Orange(String name,String colour,double weight) {
		super(name,colour,weight);
		
		}
	@Override
	public String taste() {
		return "Sour";
	}
}