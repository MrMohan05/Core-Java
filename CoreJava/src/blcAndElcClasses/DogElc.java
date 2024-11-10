package blcAndElcClasses;

public class DogElc 
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.name="Vishwajit";
		d.height=5.9;
		d.age=22;
		d.getDogInformation();
		d.bark();
		Dog d1=new Dog();
		d1.age=21;
		d1.height=5.7;
		d1.name="Kishor";
		d1.getDogInformation();
		d1.bark();	
	}
}
