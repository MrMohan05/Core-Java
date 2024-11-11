package tcs;
import java.util.*;
public class PositionSwap
{
	public static void main(String[] args)
	{
		int n,m,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=i+1;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Enter element to swap:");
		m=sc.nextInt();
		j=a[m-1];
		a[m-1]=a[n-m];
		a[n-m]=j;
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
