package blcAndElcClasses;

public class Fan 
{
	String name;
	String coil;
	int wings;
	public void switchOn()
	{
		System.out.println(name+" Is turned on has coil name "+coil+" and have "+wings+" wings");
	}
	public void switchOff()
	{
		System.out.println(name+" Is turned off has coil name "+coil+" and have "+wings+" wings\n");
	}
}
