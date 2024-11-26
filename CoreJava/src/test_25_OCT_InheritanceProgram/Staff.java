package test_25_OCT_InheritanceProgram;

public class Staff 
{
	String name;
	int id;
	Staff(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	void displayInfo()
	{
		System.out.println("Name of staff member="+name);
		System.out.println("ID of the id="+id);
	}
	
	
}
