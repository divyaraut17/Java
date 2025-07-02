package com.dkte;
import java.util.Calendar;
import java.util.Scanner;

class Date1{ //concrete class
	//fields
	private int day;
	private int month;
	private int year;
	
	//parameter-less constructor
	public Date1() {
		System.out.println("Date() ");
		Calendar c = Calendar.getInstance();
		day=c.get(Calendar.DATE);
		month=c.get(Calendar.MONTH)+1;
		year=c.get(Calendar.YEAR);
		
	}
	//Parameterized constructor
	public Date1(int day,int month,int year) {
		System.out.println("public Date(day, month ,year)");
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Day:");
        day=sc.nextInt();
        System.out.print("Month:");
        month=sc.nextInt();
        System.out.print("Year:");
        year=sc.nextInt();
}
     public void printRecord()
      {
        System.out.println("Day:"+this.day);
        System.out.println("Month:"+this.month);
        System.out.println("Year:"+this.year);
      }
}

public class Program2 {

	public static void main(String[] args) {
		
		Date1 dt1 = new Date1();// on dt1 paramter-less constructor will get called  
		Date1 dt2 = new Date1(1,1,2006);
		//dt1.printRecord();
		//dt1.acceptRecord();
		dt2.printRecord(); 
		   
	}

}
