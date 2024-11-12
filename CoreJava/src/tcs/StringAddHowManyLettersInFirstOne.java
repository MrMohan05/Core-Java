package tcs;
import java.util.*;
public class StringAddHowManyLettersInFirstOne 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String s1=sc.next();
		System.out.println("Enter 2nd string:");
		String s2=sc.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int cnt=0;
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(c2[i]==c1[j])
				{
					cnt++;
				}
			}
		}
		System.out.println("Sum is="+cnt);
	}
}
