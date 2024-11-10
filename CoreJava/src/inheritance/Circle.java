package inheritance;

public class Circle extends Shape
{
	double radius;
	Circle(String color,double radius)
	{
		super(color);
		this.radius=radius;
	}
	double area()
	{
		return 3.14*(radius*radius);
	}
}
