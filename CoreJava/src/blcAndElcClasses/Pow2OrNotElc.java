package blcAndElcClasses;

import java.util.Scanner;

public class Pow2OrNotElc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to cheack:");
		int n=sc.nextInt();
		Pow2OrNot.cheack(n);
		Pow2OrNot.cal(n);
		sc.close();
	}
}
