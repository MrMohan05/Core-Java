package tcs;

import java.util.*;
import java.util.Scanner;

public class TCSPracticeQuestion
{
	static List<String> arrenges=new ArrayList();
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter green colur:");
		int g=sc.nextInt();
		System.out.println("Enter red colur:");
		int r=sc.nextInt();
		System.out.println("Enter yellow colur:");
		int y=sc.nextInt();
		arrengments("",g,r,y,' ');
//		for(String c:arrenges)
//		{
			System.out.println(arrenges);
		//}
		sc.close();
	}
	static int z=0;
	static void arrengments(String arreng,int g,int r,int y,char last)
	{
		if(g==0 && r==0 && y==0)
		{
			arrenges.add(arreng);
			try {
				System.out.printf("\nInside %d %d %d ",g,r,y);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else {
		if(g>0 && last!='g')
		{
			//System.out.println("Inside g");
			System.out.printf("\nInside %d %d %d ",g,r,y);
			arrengments(arreng+'g',--g,r,y,'g');
		}
		if(r>0 && last!='r')
		{
//			System.out.println("Inside r");
			arrengments(arreng+'r',g,--r,y,'r');
		}
		if(y>0 && last!='y')
		{
//			System.out.println("Inside y");
			arrengments(arreng+'y',g,r,--y,'y');
		}
		}
	}
}
