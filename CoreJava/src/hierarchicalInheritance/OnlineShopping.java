package hierarchicalInheritance;

public class OnlineShopping 
{
	public static void main(String[] args)
	{
		Electronics e=new Electronics("LED TV",55000,"Samsung");
		e.displayInfo();
		System.out.println("Total prize="+e.calculateTotalCost(2));
		System.out.println("\n");
		Clothing c=new Clothing("Bleazer",400,"Medium");
		c.displayInfo();
		System.out.println("Total prize="+c.calculateTotalCost(5));
	}
}
