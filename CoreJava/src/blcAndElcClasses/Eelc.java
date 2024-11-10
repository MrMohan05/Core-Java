package blcAndElcClasses;
import java.util.*;
public class Eelc 
{
	public static void main(String args[])
	{
		Eblc e=new Eblc();
		Scanner sc=new Scanner(System.in);
		String n="",add="";
		int id=0,exp=0;
		double sal=0;
		long mob=0;
		System.out.print("Enter emp name:");
		n=sc.nextLine();
		System.out.print("Enter emp id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter emp add");
		add=sc.nextLine();
		System.out.print("Enter emp sal");
		sal=sc.nextDouble();
		System.out.print("Enter emp mob");
		mob=sc.nextLong();
		System.out.println("Enter emp exp");
		exp=sc.nextInt();
		e.setdata(n, id, add,sal, mob,exp);
		System.out.println(e.calculate());
		e.disp();
		sc.close();
	}
}
