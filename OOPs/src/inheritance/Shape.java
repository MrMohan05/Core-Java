package inheritance;

public class Shape 
{
	String color;
	Shape(String color)
	{
		this.color=color;
	}
	void displayColor()
	{
		System.out.println("Color of shape="+color);
	}
}
