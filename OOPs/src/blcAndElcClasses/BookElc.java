package blcAndElcClasses;

import java.util.Scanner;

public class BookElc 
{
	public static void main(String args[])
	{
		Book b=new Book("1984","George Orwell",100);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter discount price:");
		double d=sc.nextDouble();
		if(d<0)
		{
			System.out.println("Discount must be positive:");
		}
		else
		{
			if(b.price<0)
			{
				System.out.println("Price should be greater:");
			}
			else
			b.applyDiscount(d);
			b.printDetails();
		}
		
		sc.close();
	}
}
