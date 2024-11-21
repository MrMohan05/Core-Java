package hierarchicalInheritance;

public class Product
{
	protected String name;
	protected double price;
	Product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	void displayInfo()
	{
		System.out.println("Name of the product="+name+"\nPrice of the product="+price);
	}
	double calculateTotalCost(int quantity)
	{
		return quantity*price;
	}
}
