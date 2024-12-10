package abstraction;

public class Test extends Car
{
	public Test(String brand, String model, int milage, int top_speed, int yearOfManufacturing) 
	{
		super(brand, model, milage, top_speed, yearOfManufacturing);
	}

	@Override
	void display() 
	{
		System.out.println("Brand name : "+brand);
		System.out.println("Car Model : "+model);
		System.out.println("Milage of car : "+milage);
		System.out.println("Top speed : "+top_speed);
		System.out.println("Year of manufacture : "+yearOfManufacturing);
	}
	public static void main(String... args)
	{
		Test t=new Test("BMW","M5",15,299,2019);
		t.display();
	}
}
