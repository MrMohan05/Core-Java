package blcAndElcClasses;
import java.util.*;
public class SumElc 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int d=Sum.calculateDifference(n);
		System.out.println(n+" sum squre and squre sum diffrennce is="+d);
		sc.close();
	}
}
