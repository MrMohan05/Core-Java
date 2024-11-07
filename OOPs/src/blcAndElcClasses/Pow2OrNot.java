package blcAndElcClasses;

public class Pow2OrNot
{
	static int n;
	static boolean a=false;
	public Pow2OrNot(int n)
	{
		Pow2OrNot.n=n;
	}
	public static Pow2OrNot cheack(int n)
	{
		if(n<=0)
		{
			System.out.println("Number is zero can not perform squre operation:");
			System.out.println("value is set to 2:");
			return new Pow2OrNot(2);
			
		}
		return new Pow2OrNot(n);
	}
	public static void disp()
	{
		System.out.println("Number is set and it is:"+n+" and the answer is "+a);
	}
	public static void cal(int n)
	{
		for(int i=2;i<=n;i*=2)
		{
			if(i==n)
			{
				a=true;
			}
			
		}
		disp();
	}
}
