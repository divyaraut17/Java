package com.app.fruit;

class Apple extends Fruits{
	public Apple(String name,String colour,double weight) {
		super(name,colour,weight);
		
		}
	@Override
	public String taste() {
		return "Sweet and Sour";
	}

}
