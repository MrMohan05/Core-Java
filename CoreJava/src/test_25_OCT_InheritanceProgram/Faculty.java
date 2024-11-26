package test_25_OCT_InheritanceProgram;

public class Faculty extends Staff
{
	String department;
	Faculty(String name,int id,String department)
	{
		super(name,id);
		this.department=department;
	}
	void teachSubject()
	{
		super.displayInfo();
		System.out.println("Name of the department="+department);
	}
}
