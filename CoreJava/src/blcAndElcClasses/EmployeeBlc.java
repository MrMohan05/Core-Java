package blcAndElcClasses;

public class EmployeeBlc 
{
	protected String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	private double newSal;
	public void setEmployeeData(String firstName,String lastName,int employeeId,double salary,int noOfProject)
	{
		this.employeeId=employeeId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.noOfProject=noOfProject;
		this.salary=salary;
	}
	
	public void calculateSalary()
	{
		if(noOfProject>20)
		{
			newSal=salary+15000;
		}
		else if(noOfProject>10)
		{
			newSal=salary+10000;
		}
		else if(noOfProject>5)
		{
			newSal=salary+5000;
		}
		else
		{
			System.out.println("No Change No Of Projects Are Less Than MIN Norms");
		}
	}
	public String displayDetails()
	{
		return ("Fisrst Name="+firstName+" Last Name="+lastName+"\nEmployee Id="+employeeId+
				"\nNo of projects="+noOfProject+"\nOld salaray="+salary+"\nNew sal="+newSal);
	}
}
