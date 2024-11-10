package inheritance;

import java.util.Scanner;

public class Employee extends Person1
{
	double salary;
	public static void main(String[] args) 
	{
		Employee p=new Employee();
		p.displayEmployeeDetails();
	}
	void displayEmployeeDetails()
	{
		Person1 p=new Person1();
		System.out.println("Enter name of employee=");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter age of employee=");
		int age=sc.nextInt();
		System.out.println("Enter salary of employee=");
		double d=sc.nextDouble();
		p.displayDetails(name, age);
		System.out.println("salary="+d);
		sc.close();
	}
}
