package inheritance;

import java.util.Scanner;
class Car extends Vehical
{
	String model;
	public static void main(String args[])
	{
		System.out.println("Enter model name");
		Scanner sc=new Scanner(System.in);
		Car v=new Car();
		Vehical c=new Vehical();
		v.model=sc.nextLine();
		System.out.println("Enter brand name");
		c.brand=sc.nextLine();
		System.out.println("Enter year name");
		c.year=sc.nextInt();
		displayCarDetails(v,c);	
		sc.close();
	}
	static void displayCarDetails(Car v,Vehical c)
	{
		System.out.println("Brand="+c.brand+"\nModel="+v.model+"\nYear="+c.year);
	}
}