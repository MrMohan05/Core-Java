package multilavelInheritance;

public class Person 
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.print("Name="+name+" Age="+age);
	}
}
