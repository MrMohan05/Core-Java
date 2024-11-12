package tcs;
import java.util.Scanner;
public class SumOfSubElementsOfArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elemnts one by one:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int crnt=0,c=0,max;
		System.out.println("Enter how mony number you want to cheack between:");
		int k=sc.nextInt();
		for(int i=0;i<n-k+1;i++)
		{
			crnt=a[i];
			c=i+1;
			max=a[i];
			for(int j=1;j<k;j++)
			{
				if(c<n-1 && max<a[c])
				{
					max=a[c];
				}
				c++;
			}
			System.out.println("max between "+k+" numbers="+max);
		}
		
	}
}
