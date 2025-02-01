package com.sunbeam;

import java.util.Calendar;
import java.util.Scanner;

//Date class 
//Step 1 : Understand requirement and Declare the class 
//Step 2: Declare the fields 
//step3 : Create the instance 
//Step 4: access modifiers  
//step5: call the methods 

class Date
{
	private int day; 
	private int month; 
	private int year; 
	
	public Date( )
	{
		System.out.println("parameterless ctor called...");
		Calendar c = Calendar.getInstance(); 
		day = c.get(Calendar.DATE); 
		month = c.get(Calendar.MONTH) + 1; 
		year = c.get(Calendar.YEAR); 
	}
	public Date(int day , int month , int year)
	{
		System.out.println("Parameterized ctor called ");
		this.day = day; 
		this.month = month; 
		this.year = year; 
	}
	public void acceptRecord( )
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Day : ");
		day = sc.nextInt(); 
		System.out.println("Month");
		month = sc.nextInt(); 
		System.out.println("Year : ");
		year = sc.nextInt(); 
		
	}
	public void printRecord( )
	{
		System.out.println("Day : "+day);
		System.out.println("Month : "+month);
		System.out.println("Year : "+year);
	}
}
public class Dateprogram {

	public static void main(String[] args) {
		Date dt1 = new Date();
		dt1.printRecord();
		Date dt2 = new Date(1, 1, 2000); 
		dt2.printRecord();
		 
		 

	}

}
