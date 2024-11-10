package practice;

public class Obj 
{
	String name;
	Obj a;
	Obj (String name)
	{
		this.name=name;
	}
	public static void main(String args[])
	{
		Obj o=new Obj("Mohan");
		System.out.println("Add="+o.a+" Name="+o.name);
	}
}
