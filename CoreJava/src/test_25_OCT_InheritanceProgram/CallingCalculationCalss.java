package test_25_OCT_InheritanceProgram;

public class CallingCalculationCalss 
{
	public static void main(String[] args) 
	{
		AdvancedCalculation a=new AdvancedCalculation(5,10,15,"*");
		a.performCalculation();
		a.performAdvancedCalculation();
	}
}
