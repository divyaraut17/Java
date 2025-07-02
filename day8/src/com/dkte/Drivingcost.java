package com.dkte;
import java.util.Scanner;
public class Drivingcost {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Total miles driven per day:");
		double total=sc.nextDouble();
		
		System.out.println("Enter Cost per gallon of gasoline:");
		double cost=sc.nextDouble();
		
		System.out.println("Enter average miles per gallon:");
		double avg=sc.nextDouble();
		
		System.out.println("Enter parking fees per day:");
		double fees=sc.nextDouble();
		
		System.out.println("Enter toll per day:");
		double toll=sc.nextDouble();
		
		//calculate fuel cost
		double fuelcost=(total/avg)*cost;
		
		//total cost
		double totalcost=fuelcost+fees+toll;
		
		System.out.println("Your Total Dailt Driving cost is: "+totalcost);
	}

}
