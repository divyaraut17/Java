package com.dkte;
//Person---sub class
public class Person {
	private String name; 
	private int age; 
	
	public Person() {//parameterless
		System.out.println("public Person()");
	}
	public Person(String name, int age) {//Parameterize
		System.out.println("\npublic Person(String name, int age)");
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display( ) {
		System.out.printf("Name : %s\nAge : %d\n",this.name,this.age);
	}
}
