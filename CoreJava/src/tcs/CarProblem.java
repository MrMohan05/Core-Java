package tcs;
import java.util.*;
public class CarProblem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i,j,c=0,s=0;
		System.out.println("Enter array size:");
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter is ther car in it or not:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(a[i][j]>1)
				{
					a[i][j]=1;
				}
				if(a[i][j]==1)
				{
					c++;
				}
			}
			if(c>s)
			{
				s=i+1;
			}
		}
		System.out.println("this line has highest no of car:"+s);
	}
}
