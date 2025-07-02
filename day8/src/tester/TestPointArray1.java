package tester;
import java.util.Scanner;
import com.app.geometry.*;
public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of points to plot:");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		for(int i=0;i<points.length;i++) {
			System.out.println("Enter X and Y coordinates for points"+i+" :");
			double x= sc.nextDouble();
			double y= sc.nextDouble();
			points[i] = new  Point2D(x,y);
		}
		
		
		while(true) {
			System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. distance between 2 points");
            System.out.println("4. Exit");
           
         System.out.println("Enter your Choice:");
        	int ch = sc.nextInt(); 
    		
        	switch(ch) {
        	case 1: 
        		System.out.println("Enter index of points :");
        		int index = sc.nextInt();
        		if(index>=0 && index<points.length) {
        			System.out.println("Points["+index+"] ="+points[index].getDetails());
        		}
        		else
        			System.out.println("Invalid Index");
        		break;
        		
        	case 2:
        		for(Point2D p:points ) {
        			System.out.println(p.getDetails());
        		}
        		break;
        	case 3:
        		System.out.println("Enter the 1st index:");
        		int index1=sc.nextInt();
        		System.out.println("Enter the 2nd index:");
        		int index2= sc.nextInt();
        		
        		if(index1>=0 &&index1<points.length) 
        		  if(index2>=0 && index2 < points.length) {
        			if(! points[index1].isEqual(points[index2])) {
        				double distance = points[index1].calculateDistance(points[index2]);
        				System.out.println("Distance:"+distance);
        			}
        			else {
                        System.out.println("Points are at same location!");
                    }
        		}
        		else {
                    System.out.println("Invalid indices, pls retry!!!!");
                }
                break;
        	case 4:
        		System.out.println("Exiting program.");
        		System.exit(0);
        		 break;
        		 
           default: 
        	   System.out.println("Invalid choice");
                
        	}
        	
		}
	}
}


