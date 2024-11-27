package relationsBetweenClasses;

public class Engine 
{
	private String model;
	public Engine(String model)
	{
		this.model=model;
	}
	public String getModel()
	{
		return model;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}
	
}
