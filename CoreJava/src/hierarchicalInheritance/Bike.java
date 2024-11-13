package hierarchicalInheritance;

public class Bike extends Vehicle
{
	String type;
	Bike(String make, String model, int year, String type)
	{
		super(make,model,year);
		this.type=type;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println(" Type of bike="+type);
	}
}
