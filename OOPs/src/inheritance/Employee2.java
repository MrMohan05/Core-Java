package inheritance;

public class Employee2
{
	String name;
	double salary;
	Employee2(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void work()
	{
		System.out.println(name+" is working!");
	}
}
