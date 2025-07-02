package com.dkte;
import java.util.Calendar;
import java.util.Scanner;

class Date{
	//fields
	private int day;
	private int month;
	private int year;
	
	public void intiDate() {
		Calendar c = Calendar.getInstance();
		day=c.get(Calendar.DATE);
		month=c.get(Calendar.MONTH)+1;
		year=c.get(Calendar.YEAR);
		
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

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date d1 =new Date();//create instance
        
        d1.intiDate();
        d1.printRecord();
        d1.acceptRecord();
        d1.printRecord();
        
        
	}

}
