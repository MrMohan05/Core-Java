package blcAndElcClasses;
import java.util.Scanner;
public class BatterElc
{
	public static void main(String args[])
	{
		Batter b=new Batter();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name=");
		String n=sc.nextLine();
		System.out.print("Enter Runs=");
		int r=sc.nextInt();
		System.out.print("Enter matches=");
		int m=sc.nextInt();
		b.batterDetails(n,r,m);
		boolean v=b.validate();
		if(v)
		{
			b.computeBattingAverage();
			b.getStatistics();
		}
		sc.close();
	}
}
