package test_25_OCT_InheritanceProgram;

public class CalculationBase 
{
	int n1,n2;
	CalculationBase()
	{
	}
	CalculationBase(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	void performCalculation()
	{
		System.out.println("Sum of n1 and n2 : "+(n1+n2));
	}
}
