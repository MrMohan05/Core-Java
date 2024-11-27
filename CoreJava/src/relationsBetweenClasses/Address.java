package relationsBetweenClasses;

public class Address 
{
	private String street;
	private String city;
	Address(String street,String city)
	{
		if(street.charAt(0)=='-')
		{
			System.err.println("No negative values are aloowed:");
			System.exit(0);
		}
		this.street=street;
		this.city=city;
	}
	public String getstreet()
	{
		return street;
	}
	public String getcity()
	{
		return city;
	}
	public String toString()
	{
		return "City name : "+city+" , Street name : "+street;
	}
}
