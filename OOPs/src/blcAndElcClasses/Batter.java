package blcAndElcClasses;

public class Batter 
{
	private String name;
	private int runs;
	private int matches;
	private float batting_avg;
	public void batterDetails(String name,int runs,int matches)
	{
		this.matches=matches;
		this.name=name;
		this.runs=runs;
	}
	public void computeBattingAverage()
	{
		if(matches==0 && runs>0)
		{
			System.out.println("Zero matches and +ve runs are not allowed");
		}
		else 
		{
		System.out.println("Name="+name);
		batting_avg=runs/matches;
		System.out.println("Batting avrage="+batting_avg);
		}
	}
	public void getStatistics()
	{
		System.out.println("Name="+name);
		System.out.println("Runs="+runs);
		System.out.println("Matches="+matches);
	}
	public boolean validate()
	{
		if(matches<0 || runs<0)
		{
			System.out.println("Error! No negative are allowed");
			return false;
		}
		return true;
	}
}
