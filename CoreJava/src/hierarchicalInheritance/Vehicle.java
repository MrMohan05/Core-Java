package hierarchicalInheritance;

public class Vehicle 
{
	String make;
	String model;
	int year;
	Vehicle(String make, String model, int year)
	{
		if(year<1)
		{
			System.out.println("Error Invalid Input");
		}
		this.make=make;
		this.model=model;
		this.year=year;
	}
	void displayDetails()
	{
		System.out.print("Maker name="+make+" Model name="+model+" year of manufacture="+year);
	}
}
