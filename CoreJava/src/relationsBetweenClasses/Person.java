package relationsBetweenClasses;

public class Person 
{
	private Address a;
	private String name;
	
	Person(Address a,String name)
	{
		this.a=a;
		this.name=name;
	}
	void display()
	{
		System.out.println("Name of the person : "+name+" , "+a);
	}
}
