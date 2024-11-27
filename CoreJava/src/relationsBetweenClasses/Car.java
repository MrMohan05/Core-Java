package relationsBetweenClasses;

public class Car 
{
	private String make;
	private String model; 
	private Engine engine;
	public Car(String make, String model, Engine engine)
	{
		this.engine=engine;
		this.make=make;
		this.model=model;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine+ "]";
	}
	
}
