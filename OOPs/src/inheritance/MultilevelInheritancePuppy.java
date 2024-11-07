package inheritance;
import java.util.Scanner;
public class MultilevelInheritancePuppy extends MultilevelInheritanceDog
{
	boolean isCute;
	static String isFriendly;
	
	public static void main(String args[])
	{
		MultilevelInheritanceDog Dog=new MultilevelInheritanceDog();
		MultilevelInheritancePuppy Puppy=new MultilevelInheritancePuppy();
		Scanner sc=new Scanner(System.in);
		System.out.println("Is puppy cute:");
		Puppy.isCute=sc.nextBoolean();
		Puppy.set();
		System.out.println("Yes this puppy is frinedly:"+isFriendly);
		Dog.eat();
		sc.close();
	}
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Is puppy friendly(yes or no):");
		isFriendly=sc.nextLine();
		sc.close();
	}
}

