package overriding;

class Animal1
{
	public void roam()
	{
		System.out.println("Generic Animal is roaming");
	}
}
class Lion extends Animal1
{
	public void roam()
	{
		System.out.println("Lion Animal is roaming");
	}
	
	public void roar()
	{
		System.out.println("Lion is roaring");
	}
}
class Dog extends Animal1
{
	public void roam()
	{
		System.out.println("Dog Animal is roaming");
	}
	
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}
public class PolymorphicDemo1 
{
	public static void main(String[] args) 
	{
       Lion l = new Lion();
       animalRoam(l);
       
//       a = new Dog();
//       animalRoam(a);
	}
	
	public static void animalRoam(Animal1 C)
	{	    
	    //Lion lion = (Lion) animal;
	    C.roam();
	    //C.roar();
	}

}