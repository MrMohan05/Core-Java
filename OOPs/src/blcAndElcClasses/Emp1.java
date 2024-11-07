package blcAndElcClasses;

public class Emp1 
{
	private String firstName;  
	private String  lastName; 
	private int employeeId;
	private double   salary;
	private int NoOfProject;
	public Emp1(String firstName, String lastName, int employeeId, double salary, int noOfProject)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		NoOfProject = noOfProject;
	}
	public void calculateSalary()
	{
		if(NoOfProject>5 && NoOfProject<=10)
		{
			salary+=5000;
			System.out.println(disp());
		}
		else if(NoOfProject>10 && NoOfProject<=20)
		{
			salary+=10000;
			System.out.println(disp());
		}
		else if(NoOfProject>20)
		{
			salary+=15000;
			System.out.println(disp());
		}
		else
		{
			System.out.println("Project number is invalid:");
		}
	}
	public String disp() {
		return "\nEmployee firstName=" + firstName + ",\nlastName=" + lastName + ",\nemployeeId=" + employeeId
				+ ",\nsalary=" + salary + ",\nNoOfProject=" + NoOfProject;
	}
	
}
