package relationsBetweenClasses;

public class JohanCar 
{
	private String brand;
	 private String model;
	 private int year;
	 private Driver driver;
	 
	 JohanCar(String brand,String model,int year,Driver driver)
	 {
		 if(year<2004)
		 {
			System.err.println("The car has compleated 20 years");
			System.exit(0);
		 }
		 this.brand=brand;
		 this.driver=driver;
		 this.model=model;
		 this.year=year;
	 }
	 JohanCar(JohanCar jc)
	 {
		 this.brand=jc.getBrand();
		 this.driver=jc.getDriver();
		 this.model=jc.getModel();
		 this.year=jc.getYear();
	 }
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public Driver getDriver() 
	{
		return driver;
	}
	public void setDriver(Driver driver) 
	{
		this.driver = driver;
	}
	public void changeDriver(Driver newDriver)
	{
		this.driver=newDriver;
	}
}
