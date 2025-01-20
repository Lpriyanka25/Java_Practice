import java.util.Scanner;

class Employee
{
	//Fields 
	private int empid; //Instance variable 
	private String name; //Instance variable 
	private float salary; //Instance Variable 
	//Methods 
	public void acceptRecord( )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Name : ");
		name = sc.nextLine(); 
		System.out.println("Empid : ");
		empid = sc.nextInt(); 
		System.out.println("Salary : ");
		salary = sc.nextFloat(); 
	}
	public void printRecord( )
	{
		System.out.println("Name : "+name);
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
}
public class Program {
	
	public static void main(String[] args) {
		Employee emp = new Employee(); 
		Employee emp2 = new Employee(); 
		Employee emp3 = new Employee(); 
	}
	public static void main1(String[] args) {
		Employee emp = new Employee(); 
		emp.acceptRecord(); 
		emp.printRecord(); //message passing 

	}

}
