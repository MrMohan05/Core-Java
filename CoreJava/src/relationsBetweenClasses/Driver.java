package relationsBetweenClasses;

public class Driver 
{
	private int age;
	private String name;
	Driver(int age,String name)
	{
		if(age<=18)
		{
			System.err.println("Age should be greate than 18");
			System.exit(0);
		}
		this.age=age;
		this.name=name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}
