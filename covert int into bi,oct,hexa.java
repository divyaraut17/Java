package com.dkte;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the no :");
       int n = sc.nextInt();
       System.out.println("Given no is :"+ n);
       
       Integer i = new Integer(n);//wrapper class
       String str1 = i.toBinaryString(n);
       String str2 = i.toHexString(n);
       String str3 = i.toOctalString(n);
       
       System.out.println("Binary: "+str1);
       System.out.println("hexa: "+str2);
       System.out.println("octal: "+str3);
       
	}

}
