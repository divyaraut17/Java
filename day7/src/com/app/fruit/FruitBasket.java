package com.app.fruit;
import java.util.Scanner;
public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Basket size:");
		Fruits[] basket = new Fruits[sc.nextInt()];
        int counter=0;
        
        while(true) {
        	System.out.println("\n0. Exit\n1. Add Apple\n2. Add Mango\n3. Add Orange");
        	System.out.println("4. Show Fruit Name\n5. Fresh Fruit Details");
        	System.out.println("6.Mark a fruit as stale\n7. list of of all stale(not fresh) fruits in the basket.");
        	
        	System.out.println("Enter your Choice:");
        	
    		int ch = sc.nextInt(); 
    		
    		switch(ch) {
    		case 0: System.exit(0);
    		
    		case 1:
    			if(counter < basket.length) {
    				System.out.println("Enter Name,Colour,Weight");
    				basket[counter++]=new Apple(sc.next(),sc.next(),sc.nextDouble());
    			}
    			else System.out.println("Basket is Full");
    			break;
    			
    		case 2:
    			if(counter < basket.length) {
    				System.out.println("Enter Name,Colour,Weight");
    				basket[counter++]=new Mango(sc.next(),sc.next(),sc.nextDouble());
    			}
    			else System.out.println("Basket is Full");
    			break;
    		case 3:
    			if(counter < basket.length) {
    				System.out.println("Enter Name,Colour,Weight");
    				basket[counter++]=new Orange(sc.next(),sc.next(),sc.nextDouble());
    			}
    			else System.out.println("Basket is Full");
    			break;
    		case 4:
    			System.out.println("Name of Fruits:");
    			for(Fruits f:basket) //for each loop
    				if(f!= null) {
    					System.out.println(f.getName());
    				
    				}
    			break;
    		case 5:
            	System.out.println("Fresh Fruit Details");
                 for(Fruits f: basket) 
    				if(f!=null && f.isFresh()) {
    					System.out.println(f+" ,Taste:"+f.taste());
    				}
    			break;
    		case 6:
    			System.out.println("Enter index to mark as a stale");
    			int idex=sc.nextInt();
    			if(idex>=0 && idex < counter) {
    				basket[idex].setFresh(false);
    				System.out.println("Markes as stale");
    			}
    			else System.out.println("Invalid Index");
    		break;
    		case 7: 
    			for(Fruits f: basket) 
    				if(f!=null && !f.isFresh()) {
    					System.out.println(f.getName()+" Taste:"+f.taste());
    				}
    		break;
    		default: System.out.println("Invalid choice");
    			
    	     }
        
	     }
     }
}

	


