package com.dkte;

public class demo1 {

	public static void main(String[] args) {
		String[] arr1= {"divya","shrusti","suhana","pari"};
		String[] arr2= {"amay","divya","pari","aditya"};
		
		System.out.println("Duplicates are:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					System.out.println(arr2[j]);
				}
			}
		}
}
}