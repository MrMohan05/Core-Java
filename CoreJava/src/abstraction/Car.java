package abstraction;

public abstract class Car 
{
	String brand;
	String model;
	int milage;
	int top_speed;
	int yearOfManufacturing;
	public Car(String brand, String model, int milage, int top_speed, int yearOfManufacturing) {
		super();
		this.brand = brand;
		this.model = model;
		this.milage = milage;
		this.top_speed = top_speed;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getMilage() {
		return milage;
	}
	public int getTop_speed() {
		return top_speed;
	}
	public int getYearOfManufacturing() {
		return yearOfManufacturing;
	}
	abstract void display();
}
