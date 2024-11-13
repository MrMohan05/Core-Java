package hierarchicalInheritance;

public class CallingVehicle 
{
	public static void main(String[] args) 
	{
		int year=2024;
		int n=4;
		Bike b=new Bike("Kawasaki","650",year,"Sports");
		Car c=new Car("BMW","M5",year,n);
		if(year<1 || n<1)
		{
			System.out.println("Error Invalid Input");
		}
		else
		{
		b.displayDetails();
		c.displayDetails();
		}
	}
}
