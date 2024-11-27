package relationsBetweenClasses;

public class CallingJohanCar 
{
	public static void main(String args[])
	{
		Driver d=new Driver(21,"Mohan");
		JohanCar jc=new JohanCar("BMW","M5",2020,d);
		
		JohanCar jc2=new JohanCar(jc);	
		
		displayCar(jc);
		System.out.println();
		displayCar(jc2);
		
		
		Driver d2=new Driver(25,"Nothing");
		jc.changeDriver(d2);
		
		System.out.println();
		
		displayCar(jc);
		System.out.println();
		displayCar(jc2);
	}
	public static void displayCar(JohanCar c)
	{
		System.out.println("Car Brand : "+c.getBrand());
		System.out.println("Car Model : "+c.getModel());
		System.out.println("Car Model : "+c.getYear());
		System.out.println("Age of the driver : "+c.getDriver().getAge());
		System.out.println("Age of the driver : "+c.getDriver().getName());
	}
}
