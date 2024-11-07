package blcAndElcClasses;

import java.util.Scanner;

public class Dis 
{
	public static void main(String args[])
	{
		//disBlc d=new disBlc();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter membership:");
		String n=sc.next();
		char c=n.charAt(0);
		boolean b;
		if(c=='y' || c=='Y')
		{
			 b=true;
		}
		else
		{
			 b=false;
		}
		if(b)
		{
			System.out.println("Enter age:");
			int age=sc.nextInt();
			disBlc.cheack(age);
		}
		else
		System.out.println("No member:");
		sc.close();
	}
}
