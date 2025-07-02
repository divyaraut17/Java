package com.dkte;

class Employee{
	private String name;
	private int age;
	
	public Employee() {
		this("Divya",20);  //constructor chaining
	}
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void printRecord() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
	}
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee p= new Employee();
       p.printRecord();
	}

}
