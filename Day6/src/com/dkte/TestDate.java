package com.dkte;

public class TestDate {

	public static void main(String[] args) {
		Date dt1=new Date(1,1,2000);
		dt1.displayDate();
		dt1.setMonth(2);
		dt1.setDay(17);
		dt1.setYear(2020);
		System.out.println("updated date:");
		dt1.displayDate();
	}

}
