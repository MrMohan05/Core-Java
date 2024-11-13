package tcs;

import java.util.Scanner;

public class DistinctElements 
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 2 arrys");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter 1st array elemnts:");
		int a[]=new int[n],b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array elemnts:");
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int i=0,j=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					for(int k=j;k<m-1;k++)
					{
						b[k]=b[k+1];
					}
					m--;
					j--;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<m;i++)
		{
			System.out.println(b[i]);
		}
    }
}
