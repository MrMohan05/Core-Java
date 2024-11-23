package practice;

class Animal
{
	private int age;
	private String name;
	public Animal(int age, String name) 
	{
		super();
		this.age = age;
		this.name = name;
	}
	void makeSound()
	{
		System.out.println("The animal makes a generic sound.");
	}
	void displayInfo()
	{
		System.out.println("name="+name+" age="+age);
	}
}

class Lion extends Animal
{
	private int maneLength;

	public Lion(int age, String name,int maneLength) 
	{
		super(age, name);
		this.maneLength=maneLength;
	}
	void makeSound()
	{
		
		System.out.println("The lion roars loudly.");
	}
	void displayManeLength()
	{
		System.out.println("ManeLength="+maneLength);
	}
}

class Elephant extends Animal
{
	private float tuskLength;
	
	Elephant(int age, String name,float tuskLength) 
	{
		super(age, name);
		this.tuskLength=tuskLength;
	}	
	void makeSound()
	{
		super.makeSound();
		System.out.println("The elephant trumpets.");
	}
	void displayTuskLength()
	{
		System.out.println("Tusk lenght = "+tuskLength);
	}
}
public class ZooAnimals 
{
	public static void main(String[] args) 
	{
		Elephant e=new Elephant(15,"Raju",12.5f);
		Lion l=new Lion(10,"Bagira",150);
		e.displayInfo();
		e.makeSound();
		e.displayTuskLength();
		System.out.println();
		l.displayInfo();
		l.makeSound();
		l.displayManeLength();
	}
}

//  Create a class named ZooManagementSystemTester (as provided in the code):
//    In the main method, create instances of both Lion and Elephant with appropriate values.
//    Print information about the lion and the elephant, including their specific attributes and the sounds they make.
//
//Your task is to implement the required classes based on the provided problem description.