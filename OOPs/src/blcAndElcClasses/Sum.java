package blcAndElcClasses;

public class Sum 
{
	
	public static int calculateDifference(int n)
	{
		int sc=0,cs=0,sum=0;
		for(int i=1;i<=n;i++)
		{
			sc+=i*i;
		}
		for(int i=1;i<=n;i++)
		{
			cs+=i;
		}
		cs*=cs;
		sum=cs>sc?cs-sc:sc-cs;
		return sum;
	}
}
