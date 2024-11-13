package hierarchicalInheritance;

public class Car extends Vehicle
{
	int numberOfDoors;
	Car(String make, String model, int year,int numberOfDoors)
	{
		super(make,model,year);
		this.numberOfDoors=numberOfDoors;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.print(" Number of doors="+numberOfDoors);
	}
}
