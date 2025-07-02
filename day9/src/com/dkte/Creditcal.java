package com.dkte;
import java.util.Scanner;
public class Creditcal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Account number:");
		int num=sc.nextInt();
		
		System.out.println("Enter balance at the beginning of the month: ");
		int balance= sc.nextInt();
		
		System.out.println("Enter total of all items charged by the customer this month:");
		int totalcharge=sc.nextInt();
		
		System.out.println("Enter total of all credits applied to the customer’s account this month");
		int totalcredits=sc.nextInt();
		
		System.out.println("Enter allowed credit limit:");
		int limit = sc.nextInt();
		
		int newBalance=balance+totalcharge-totalcredits;
		System.out.println("New Balance is :"+newBalance);
		
	  boolean isCreditlimitExceeded= newBalance > limit;
	  
	  if(isCreditlimitExceeded) {
		  System.out.println("Credit Limit is Exceeded");
	  }
	}

}
