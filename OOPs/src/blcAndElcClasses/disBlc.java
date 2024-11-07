package blcAndElcClasses;

import java.util.Scanner;

public class disBlc
{
	public static void cheack(int age) {
	Scanner sc=new Scanner(System.in);
	
		if(age>19)
		{
			System.out.println("Dis");
		}
		else if(age>50)
		{
			System.out.println("50%");
		}
		else
		{
			System.out.println("Error");
		}
	sc.close();
	
	}
}
