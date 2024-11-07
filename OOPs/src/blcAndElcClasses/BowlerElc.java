package blcAndElcClasses;
import java.util.Scanner;
public class BowlerElc
{
	public static void main(String[] args) 
	{
		Bowler b=new Bowler();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name=");
		String n=sc.nextLine();
		System.out.print("Enter wickets=");
		int w=sc.nextInt();
		System.out.print("Enter matches=");
		int m=sc.nextInt();
		System.out.print("Enter balls_boweled=");
		int bb=sc.nextInt();
		System.out.print("Enter runs_conceded=");
		int c=sc.nextInt();
		b.bowlerDetails(n,w, m,bb, c);
		boolean v=b.validate();
		System.out.println(v);
		if(v)
		{
			b.computeBowlingAverage();
			b.computeStrikeRate();
			b.showStatistics();
		}
		sc.close();
	}

}
