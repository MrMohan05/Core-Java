package tcs;
import java.util.*;
public class GoodNumberBadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int m=n,i,r,d=0;
		while(m!=0)
		{
			r=m%10;
			m/=10;
			d+=r;
		}
		if(n%d==0)
		{
			System.out.println("Good Number");
		}
		else
		{
			System.out.println("Bad Number");
		}
	}
}
