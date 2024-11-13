package hierarchicalInheritance;

public class Student 
{
	protected String name;
	protected int rollNumber;
	Student(String name,int rollNumber)
	{
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public void displayDetails()
	{
		System.out.println("Name="+name+"\nRoll number="+rollNumber);
	}
	public double calculatePercentage()
	{
		return 0.0;
	}
	
}
