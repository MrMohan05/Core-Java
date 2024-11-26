package test_25_OCT_InheritanceProgram;

public class Manager extends Employee
{
	String department;
	Manager(String name,int id,String department)
	{
		super(name,id);
		this.department=department;
	}
	void manageTeam()
	{
		super.displayInfo();
		System.out.println("This manager manages \""+department+"\"  department:");
	}
}
