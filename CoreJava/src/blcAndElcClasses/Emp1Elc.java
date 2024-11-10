package blcAndElcClasses;

public class Emp1Elc
{
	public static void main(String args[])
	{
		Emp1 e= new Emp1("John","Doe",101,50000,7);
		System.out.println(e.disp());
		e.calculateSalary();
		
		Emp1 e1= new Emp1("Michael","Johnson",105,45000,-5);
		System.out.println(e1.disp());
		e1.calculateSalary();		
	}
}
