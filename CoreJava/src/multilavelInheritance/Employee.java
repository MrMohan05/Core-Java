package multilavelInheritance;

public class Employee extends Person
{
	String employeeId;
	Employee(String employeeId,String name,int age)
	{
		super(name,age);
		this.employeeId=employeeId;
	}
	public void displayEmployeeInfo()
	{
		displayInfo();
		System.out.print(" Employee ID="+employeeId);
	}
}
