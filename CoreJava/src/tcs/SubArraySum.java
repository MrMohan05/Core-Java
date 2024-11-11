package tcs;

import java.util.Scanner;
public class SubArraySum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array lenght:");
		int n=sc.nextInt();
		System.out.println("Enter array elemnts one by one:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter sum you need to find");
		int s=sc.nextInt();
		int sum=0,strt=0;
		for(int i=strt;i<n;i++)
		{
			sum+=a[i];
			int x=i;
			if(sum==s)
			{
				for(int j=strt;j<=x;j++)
				{
				System.out.print(a[j]+" ");
				}
				strt=x;
			}
		}
		sc.close();
	}
}
