package com.sunbeam;
class Person1 
{
	private String name; 
	private int age; 
	
	public Person() {
		this("Aditya", 31);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printRecord( )
	{
		System.out.println("Name : "+name);
		System.out.println("Age " + age);
	}
}
public class Person {

	public static void main(String[] args) {
		Person p1 = new Person(); 
		p1.printRecord();

	}

}
