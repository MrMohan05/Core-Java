package relationsBetweenClasses;

public class CallingCustomer 
{
	public static void main(String[] args)
	{
		Order o=new Order("2135","Buds");
		Customer c=new Customer("Mohan","Hello@gmail.com",o);
		System.out.println(c);
	}
}
