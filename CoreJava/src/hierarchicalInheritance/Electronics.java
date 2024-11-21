package hierarchicalInheritance;

public class Electronics extends Product
{
	private String brand;
	Electronics(String name,double price,String brand)
	{
		super(name,price);
		this.brand=brand;
	}
	void displayInfo()
	{
		System.out.println("Brand name="+brand);
		super.displayInfo();
	}
}
