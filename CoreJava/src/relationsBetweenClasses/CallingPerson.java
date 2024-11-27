package relationsBetweenClasses;

public class CallingPerson 
{
	public static void main(String args[])
	{
		Address a=new Address("123 Gangapur Road","Nashik");
		Person p=new Person(a,"Mohan");
		p.display();
	}
}
