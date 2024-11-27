package relationsBetweenClasses;

public class CallingCarClass 
{
	public static void main(String[] args)
	{
		Engine e=new Engine("V8");
		Car c=new Car("BMW","M5",e);
		System.out.println(c);
	}
}
