package hierarchicalInheritance;

public class Cylinder extends Circle
{
	double height;
	Cylinder()
	{
	}
	Cylinder(double height,double radius)
	{
		super(radius);
		this.height=height;
	}
	public double getVolume()
	{
		if(height<=0 || super.radius<=0)
		{
			return -1;
		}
		
		return 3.14*super.radius*super.radius*this.height;
	}
}
