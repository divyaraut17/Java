package com.dkte;
import java.util.Scanner;
public class Date {

	 private int day;
	 private int month;
	 private int year;
	 
	 public Date() {//parameterless
		 this(1,1,2000);//access of parameterized c
	 }
	 public Date(int day,int month,int year) {
		 this.day=day;
		 this.month=month;
		 this.year=year;
	 }
	 public int getDay() {
		 return day;
	 }
	 public void setDay(int day) {
		 this.day=day;
	 }
	 public int setMonth() {
		 return month;
	 }
	 public void setMonth(int month) {
		 this.month=month;
	 }
	 public int setYear() {
		 return year;
	 }
	 public void getYear(int year) {
		 this.year=year;
	 }
	 public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Day:");
		day=sc.nextInt();
		System.out.println("Month:");
		month=sc.nextInt();
		System.out.println("Year:");
		year=sc.nextInt();	 
		}
	 public void display() {
		 System.out.printf("Date:%d/%d/%d\n",this.day,this.month,this.year);
	 }
	 

	}

