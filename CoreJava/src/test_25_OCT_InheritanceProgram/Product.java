package test_25_OCT_InheritanceProgram;

public class Product 
{
	protected String name;
	protected double price;
	public Product(String name, double price) 
	{
		this.name = name;
		this.price = price;
	}
	void displayInfo()
	{
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
	}
	double calculateTotalCost(int qyt)
	{
		return price*qyt;
	}
}
