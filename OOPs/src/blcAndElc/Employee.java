package blcAndElc;

public class Employee 
{
	private String name;                    	 
	private int age ;
	private String department;
	private double salary;
	private String performance;
	public Employee(String name,int age,String department,double salary,String performance)
	{
		this.age=age;
		this.department=department;
		this.name=name;
		this.performance=performance;
		this.salary=salary;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}

	public void setdepartment(String department)
	{
		this.department=department;
	}
	public String getdepartment()
	{
		return department;
	}
	
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	public double getsalary()
	{
		return salary;
	}
	
	public void setperformance(String performance)
	{
		this.performance=performance;
	}
	public String getperformance()
	{
		return performance;
	}
	
	public static Employee validate(String name,int age,String department,double salary,String performance)
	{
		if(age<=0 || salary<=0)
		{
			System.err.println("No negative values are allowed");
			return new Employee("",0,"",0,"");
		}
		else
		return new Employee(name,age,department,salary,performance);
	}
	
	public double updateSalary()
	{
		if("good".equalsIgnoreCase(performance))
		{
			salary+=10000;
		}
		else if("average".equalsIgnoreCase(performance))
		{
			salary+=5000;
		}
		else if("".equals(performance))
		{
			System.out.println("No bonus is added");
		}
		return salary;
	}
	public String disp() {
		return "Employee name=" + name + "\nage=" + age + "\ndepartment=" + department + "\nsalary=" + salary
				+ "\nperformance=" + performance +"\n";
	}
	
}
