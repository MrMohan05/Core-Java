package abstraction;

import java.util.Scanner;

public class Testing 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter name of food : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		if(name.equalsIgnoreCase("Bread"))
		{
			Bread b=new Bread(15,10,5);
			System.out.println("Bread is  : "+b.getType());
			System.out.println("Taste : "+b.getTaste());
			System.out.println("Macros : "+b.getMacros());
		}
		if(name.equalsIgnoreCase("Egg"))
		{
			Egg b=new Egg(15,10,5);
			System.out.println("Egg is  : "+b.getType());
			System.out.println("Taste : "+b.getTaste());
			System.out.println("Macros : "+b.getMacros());
		}
		sc.close();
	}
	
}
