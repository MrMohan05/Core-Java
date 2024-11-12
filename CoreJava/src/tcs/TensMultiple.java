package tcs;
import java.util.*;
public class TensMultiple 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to fing tend multiple of it:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			sum+=(n*i);
		}
		System.out.println("Sum="+sum);
	}
}
