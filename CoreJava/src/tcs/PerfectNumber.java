package tcs;
import java.util.*;
public class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println("Number is perfect number:");
		}
		else
		{
			System.out.println("Number is not a perfect number:"+sum);
		}
		sc.close();
	}
}
