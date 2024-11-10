package inheritance;

public class Manager extends Employee2
{
	String department;
	Manager(String name, double salary,String department) 
	{
		super(name, salary);
		this.department=department;
	}
	void manage()
	{
		System.out.println(name+" is managing the "+department);
	}
	void sal()
	{
		System.out.println("For "+salary+" this much amount");
	}
}
