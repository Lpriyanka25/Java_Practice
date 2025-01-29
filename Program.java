package com.sunbeam;

import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) { // ( name , accountnumber , balance)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :: ");
		String name = sc.next();
		System.out.println("Enter the accountNumber");
		int accountNumber = sc.nextInt();
		System.out.println("Enter the Balance : ");
		double balance = sc.nextDouble();

		System.out.println("Name : " + name);
		System.out.println("AccountNumber : " + accountNumber);
		System.out.println("Balance : " + balance);

	}
	 
	/*
	  public static void main(String[] args) { 
		  //( name , accountnumber , balance)
	  Scanner sc = new Scanner(System.in); 
	  System.out.print("Enter the name : ");
	  String name = sc.nextLine(); 
	  System.out.print("Enter the accountNumber: "); 
	  int accountNumber= sc.nextInt(); 
	  System.out.print("Enter the Balance : "); 
	  double balance = sc.nextDouble();
	  
	  System.out.println("Name : "+name);
	  System.out.println("AccountNumber : "+accountNumber);
	  System.out.println("Balance : "+balance);
	  
	 }
	*/
	/*
	public static void main(String[] args) {
		//( name , accountnumber , balance)  
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter the accountNumber :: ");
		int accountNumber= sc.nextInt(); 
		
		System.out.print("Enter the name :: ");
		sc.nextLine(); 
		String name = sc.nextLine();  
		
		System.out.print("Enter the Balance : ");
		double balance = sc.nextDouble(); 
		
		System.out.println("Name : "+name);
		System.out.println("AccountNumber : "+accountNumber);
		System.out.println("Balance : "+balance);
				
				
	} 
*/

}
