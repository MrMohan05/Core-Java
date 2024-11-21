package practice;
import java.util.*;
public class ArrayMising 
{
	public static void main(String args[])
	{
		int x;
		System.out.println("Enter array size:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter "+x+" Array elements:");
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<x;i++)
		{
			sum+=a[i];
		}
		System.out.println("Missing number="+(((x+1)*(x+2)/2)-sum));
		sc.close();
	}
}
