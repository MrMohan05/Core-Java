package test_25_OCT_InheritanceProgram;

public class Clothing extends Product
{
	String size;
	Clothing(String name, double price,String size)
	{
		super(name,price);
		this.size=size;
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("Size of cloth is : "+size);
	}
}
