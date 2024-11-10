package tcs;

import java.util.Scanner;

public class CoinConverter 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of coins:");
		int n=sc.nextInt();
		int r,d;
		while(n!=1)
		{
			if(n>10)
			{
				d=n/10;
				System.out.println("No of 10 rppes coins:"+d);
				n%=10;
				
			}
			if(n>5)
			{
				d=n/5;
				System.out.println("No of 5 rppes coins:"+d);
				n%=5;
			}
			if(n>2)
			{
				d=n/2;
				System.out.println("No of 2 rppes coins:"+d);
				n%=2;
			}
			if(n>0)
			{
				System.out.println("No of 1 rppes coins:"+n);
			}
		}
	}
}
