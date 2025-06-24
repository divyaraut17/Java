package com.dkte;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      int i,n=5;
      int first=0,second=1;
      System.out.println(first);
      System.out.println(second);
      for( i=0;i<n;i++)
      {    
    	  int next=first+second;
    	  System.out.println(next);
    	  first=second;
    	  second=next;
    		  
    	  }
      }
      
	}


