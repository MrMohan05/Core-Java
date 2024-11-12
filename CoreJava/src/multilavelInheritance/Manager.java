package multilavelInheritance;

public class Manager extends Employee
{
	String departmentName;
	Manager(String departmentName,String employee,String name,int age)
	{
		super( employee, name, age);
		this.departmentName=departmentName;
	}
	public void displayManagerInfo()
	{
		displayEmployeeInfo();
		System.out.print(" Department Name="+departmentName);
	}
}
