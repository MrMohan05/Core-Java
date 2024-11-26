package test_25_OCT_InheritanceProgram;

public class Employee 
{
	String name;
	int id;
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	void displayInfo()
	{
		System.out.println("Name of the employee : "+name);
		System.out.println("ID of the employee : "+id);
	}
	
}
