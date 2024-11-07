package blcAndElcClasses;

public class Emp2Elc
{
	public static void main(String args[])
	{
		Emp2 e1=Emp2.set(232,"Naresh Kumar",43000);
		if(e1.employeeSalary>=60000)
		{
			System.out.println("Employee is a Developer");
		}
		else if(e1.employeeSalary>=4000 && e1.employeeSalary<60000)
		{
			System.out.println("Employee is a Designer");
		}
		else if(e1.employeeSalary<40000)
		{
			System.out.println("Employee is a Tester");
		}
		else
		{
			System.out.println("Envalid salary");
		}
		System.out.println(e1.disp());
	}
}
