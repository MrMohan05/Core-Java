package overriding;

public class Shape 
{
	void draw()
	{
		System.out.println("shape draw:");
	}
	void erase()
	{
		System.out.println("shape erase:");
	}
	public static Shape randshape()
	{
		switch ((int) (Math.random()*3))
		{
		case 0: System.out.println("Default:");return new Circle();
			
		case 1: System.out.println("Default:"); return new Triangle();
		
		case 2: System.out.println("Default:"); return new Square();
		}
		return null;
	}
}
class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Circle draw:");
	}
	@Override
	void erase()
	{
		System.out.println("Circle erase:");
	}
}
class Triangle extends Shape
{
	
	void draw()
	{
		System.out.println("Triangle draw:");
	}
	void erase()
	{
		System.out.println("Triangle erase:");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Square draw:");
	}
	void erase()
	{
		System.out.println("Square erase:");
	}
}