package blcAndElcClasses;

public class Emp2 
{
	public int employeeNumber;
	public String employeeName;
	public double employeeSalary;
	public Emp2(int employeeNumber,String employeeName,double employeeSalary)
	{
		this.employeeName=employeeName;
		this.employeeNumber=employeeNumber;
		this.employeeSalary=employeeSalary;
	}
	public static Emp2 set(int employeeNumber,String employeeName,double employeeSalary)
	{
		if(employeeNumber<0)
		{
			System.out.println("id must be always positive integer");
			employeeNumber=0;
		}
		else if(employeeSalary<0)
		{
			System.out.println("salary must be always positive integer");
			employeeSalary=0;
		}
		else if(employeeName==null)
		{
			System.out.println("name must be anything");
			employeeName="No name";
		}
		return new Emp2(employeeNumber,employeeName,employeeSalary);
	}
	public String disp() {
		return "Emp2 [employeeNumber=" + employeeNumber + ",\nemployeeName=" + employeeName + ",\nemployeeSalary="
				+ employeeSalary + "]";
	}
	
}
