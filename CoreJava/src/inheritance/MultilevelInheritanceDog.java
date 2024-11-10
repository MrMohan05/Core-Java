package inheritance;
import java.util.Scanner;
public class MultilevelInheritanceDog extends MultiLevelInheritanceAnimal
{
	String colur;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MultiLevelInheritanceAnimal Animal=new MultiLevelInheritanceAnimal();
		MultilevelInheritanceDog Dog=new MultilevelInheritanceDog();
		System.out.println("Enter name of dog:");
		Animal.name=sc.nextLine();
		System.out.println("Enter Age of dog:");
		Animal.age=sc.nextInt();
		System.out.println("Does dog having tail or not:");
		Animal.havingTailOrNot=sc.nextBoolean();
		sc.nextLine();
		System.out.println("Enter colur of dog");
		Dog.colur=sc.nextLine();
		Animal.eat();
		Animal.sleep();
		Dog.disp(Animal,Dog);
		sc.close();
	}
	void disp(MultiLevelInheritanceAnimal Animal,MultilevelInheritanceDog Dog)
	{
		super.eat();
	
		System.out.println("Name="+Animal.name+"\nAge="+Animal.age+"\nHaving tail or not="+Animal.havingTailOrNot+"\nColur="+Dog.colur);
	}
	void play()
	{
		System.out.println("Dog is playing:");
	}
}
