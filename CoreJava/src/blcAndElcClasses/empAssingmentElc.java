package blcAndElcClasses;

import java.util.Scanner;

public class empAssingmentElc 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		empBlc e=new empBlc();
		System.out.print("Enter emp id");
		int eid=(sc.nextInt());
		System.out.print("Enter emp name");
		String ename=(sc.next());
		System.out.print("Enter emp sal");
		double sal=(sc.nextDouble());
		e.setEmployeeData(eid,ename,sal);
		e.getEmployeeData();
		sc.close();
	}
}
