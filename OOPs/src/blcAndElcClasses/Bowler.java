package blcAndElcClasses;

public class Bowler 
{
	private String name;
	private int wickets;
	private int matches;
	private int ball_bowled;
	private int runs_conceded;
	
	public void bowlerDetails(String name,int wickets,int matches,int ball_bowled,int runs_conceded)
	{
		this.ball_bowled=ball_bowled;
		this.matches=matches;
		this.name=name;
		this.runs_conceded=runs_conceded;
		this.wickets=wickets;
	}
	public void computeBowlingAverage()
	{
		if(matches>0) {
		System.out.println("\nName of the player="+name);
		System.out.println("Bowling avrage="+(runs_conceded/wickets));
		}
		else
		{
			System.out.println("\nError matches are 0");
		}
	}
	public void computeStrikeRate()
	{
		if(matches>0)
		{
			System.out.println("\nName of the player="+name);
			System.out.println("Bowler strike-rate="+(runs_conceded/ball_bowled));
		}
		else
		{
			System.out.println("\nError matches are 0");
		}
	}
	public void showStatistics()
	{
		System.out.println("\nName="+name);
		System.out.println("Wickets="+wickets);
		System.out.println("matches="+matches);
		System.out.println("\nballs_bowled="+ball_bowled);
		System.out.println("runs_conceded="+runs_conceded);
	}
	public boolean validate()
	{
		if(matches<0 || ball_bowled<0 || runs_conceded<0 || wickets<0)
		{
			System.out.println("\nError negative values are not allowed");
			return false;
		}
		return true;
	}
	
	
}
