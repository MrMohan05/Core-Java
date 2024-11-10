package tcs;
import java.util.*;
public class MatricDiagonalAddition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int [][]a=new int[n][n];
		System.out.println("Enter array elemenst:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int s1=0,s2=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
				s1+=a[i][j];	
				}
				if(i+j>n)
				{
					s2+=a[i][j];	
				}
			}
		}
		System.out.printf("addition is=%d %d",s1,s2);
	}
}
//11 12 13
//21 22 23
//31 32 33