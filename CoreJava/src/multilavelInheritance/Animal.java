package multilavelInheritance;

public class Animal
{
	private String name;
	Animal(String name)
	{
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void display()
	{
		System.out.println("Name of animal="+name);
	}
}
