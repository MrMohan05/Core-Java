package tcs;

import java.util.Scanner;

public class Recursion 
{
	static String s="";
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter g:");
		int g=sc.nextInt();
		System.out.print("Enter r:");
		int r=sc.nextInt();
		System.out.print("Enter y:");
		int y=sc.nextInt();
			
		find("",g,r,y,' ');;
		System.out.println(s);
		sc.close();
	}
	static void find(String str,int g,int r,int y,char l)
	{
		if(g==0 && r==0 && y==0)
		{
			s=s+" "+str;
		}
		if(g>0 && l!='g')
		{
			find(str+'g',g-1,r,y,'g');
		}
		if(r>0 && l!='r')
		{
			find(str+'r',g,r-1,y,'r');
		}
		if(y>0 && l!='y')
		{
			find(str+'y',g,r,y-1,'y');
		}
	}
}
