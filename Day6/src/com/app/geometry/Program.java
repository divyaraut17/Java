package com.app.geometry;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Coordinate for pt1:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Enter coordinate for pt2:");
		int x2 = sc.nextInt();
		int y2= sc.nextInt();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
      System.out.println(p1.getDetails());
      System.out.println(p2.getDetails());
      
      if (p1.isEqual(p2)) {
          System.out.println("Both points are at the same location.");
      } else {
          System.out.println("Points are at different locations.");
          double distance = p1.calculateDistance(p2);
          System.out.printf("Distance between the two points: %.2f", distance);
      }
     
	}

}
