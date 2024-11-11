package tcs;
import java.util.*;
public class Reverse 
{
	public static void main(String[] args) 
	{
		int n,m,i,j,r=0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to make it reverse:");
		n=sc.nextInt();
		m=n;
		while(m!=0)
		{
			j=m%10;;
			m/=10;
			r=(r*10)+j;
		}
		System.out.println(r+" ");
	}
}
