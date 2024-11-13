package hierarchicalInheritance;

public class Circle 
{
	double radius;
	Circle()
	{
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		if(radius>0)
		{
			return 3.14*radius*radius;
		}
		else
			return -1;
	}
}
