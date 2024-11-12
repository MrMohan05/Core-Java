package tcs;
import java.util.Scanner;
public class StringFrequence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string size:");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elemenst in string:");
		String []s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			cnt=1;
			for(int j=i+1;j<n;j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
					cnt++;
					for(int k=j;k<n-1;k++)
					{
						s[k]=s[k+1];
					}
				}
				n--;
				j--;
			}
			System.out.println(s[i]+"  =  "+cnt);
		}
	}
}
