package com.dkte;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no:");
        
        if(!sc.hasNextDouble())
        {
        	System.out.println("error");
        	
        }
        else {
        	
        	double n1 = sc.nextDouble();
            System.out.print("Enter 2nd no:");
            double n2 = sc.nextDouble();
            
            double sum = n1+n2;
            double avg = sum/2;
        	
        	System.out.println("average is :"+avg);
        }
        
	}

}
