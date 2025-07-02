package com.dkte;

public class Demo1 {
//2D array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int[][] arr1 =new int[3][3];//memory allocated on heap
        //int[] arr2[] = new  int[3][3];
        //int arr3[][] = new int[3][3];
        double[][]arr4 = new double[][] {{1.1,1.2,1.3} ,{2.1,2.2,2.3}};//2rows,3columns
        //double[][]arr5 = {{1.1,1.2,1.3},{2.1,2.2,2.3}};
        
        /*for(int i=0;i<2;i++) //rows{
        	for(int j=0;j<3;j++)//columns
        	{
        		System.out.print(arr4[i][j]+" ");
        	}
        	System.out.println();
        }*/
//Ragged array
   int[][] rarr = new int[4][];
   
   rarr[0]=new int[1];
   rarr[1]=new int[2];
   rarr[2]=new int[3];
   rarr[3]=new int[4];
   
   for(int i=0;i< rarr.length;i++) {
	   for(int j=0;j<rarr[i].length;j++) {
		   System.out.print(rarr[i][j]+" "); 
	   }
	   System.out.println();
   }
       int num=0;
        for(int i=0;i<rarr.length;i++) {
        	for(int j=0;j<rarr[i].length;j++) {
        		rarr[i][j]=++num;//first increase then assign
        	}
        	System.out.println();
        }
        for(int i=0;i<rarr.length;i++) {
        	for(int j=0;j<rarr[i].length;j++) {
        		System.out.print(rarr[i][j]+" ");
        	}
        	System.out.println();
        }
    }

}
