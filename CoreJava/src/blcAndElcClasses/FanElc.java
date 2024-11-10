package blcAndElcClasses;

public class FanElc 
{
	public static void main(String args[])
	{
		Fan f1=new Fan();
		f1.name="Bajaj";
		f1.coil="Copper";
		f1.wings=3;
		f1.switchOn();
		f1.switchOff();
		
		Fan f2=new Fan();
		f2.name="Crompton";
		f2.coil="Copper+Alumenium";
		f2.wings=4;
		f2.switchOn();
		f2.switchOff();
	}
}
