package tcs;
import java.util.*;
public class Armstrong 
{
	public static void main(String[] args) 
	{
		int n,m,r,d=1,i,j=0,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		m=n;
		for(l=0;m!=0;m/=10,l++);
		m=n;
		while(m!=0)
		{
			r=m%10;
			d=1;
			for(i=1;i<=l;i++)
			{
				d*=r;
			}
			j+=d;
			m/=10;
		}
		if(j==n)
		System.out.println("Yes");
		else
			System.out.println("No");
	}
}
