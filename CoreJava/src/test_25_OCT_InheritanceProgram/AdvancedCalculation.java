package test_25_OCT_InheritanceProgram;

public class AdvancedCalculation extends CalculationBase
{
	double n;
	String o;
	AdvancedCalculation(int n1,int n2,double n,String o)
	{
		super(n1,n2);
		this.n=n;
		this.o=o;
	}
	void performAdvancedCalculation()
	{
		switch(o)
		{
		case "*":System.out.println("Multiplication is : "+(n1*n2));break;
		case "/":if (n1>n2)
				System.out.println("Division is : "+(n1/n2));
				else
				System.out.println("Division is : "+(n2/n1));
				break;
		case "-":if (n1>n2)
				System.out.println("Substraction is : "+(n1-n2));
				else
				System.out.println("Substraction is : "+(n2-n1));
				break;
		}
	}
}
