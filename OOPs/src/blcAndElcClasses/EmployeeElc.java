package blcAndElcClasses;
import java.util.*;
public class EmployeeElc 
{
	public static void main(String args[])
	{
		EmployeeBlc e=new EmployeeBlc();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String s1=sc.next();
		System.out.println("Enter last Name:");
		String s2=sc.next();
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter salary:");
		double s=sc.nextDouble();
		System.out.println("Enter no of projects:");
		int p=sc.nextInt();
		sc.close();
		e.setEmployeeData(s1, s2, id, s, p);
		e.calculateSalary();
		System.out.println(e.displayDetails());
	}
}
