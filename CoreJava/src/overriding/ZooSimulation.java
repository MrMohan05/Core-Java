package overriding;

public class ZooSimulation 
{
	public static void main(String[] args)
	{
		Mammal m=new Mammal(true,"Tiger");
		m.reproduce();
		m.makeSound();
		m.nurseYoung();
		System.out.println(m);
		
		System.out.println();
		
		Bird b=new Bird(true,"Eagle");
		b.makeSound();
		b.reproduce();
		b.buildNest();
		System.out.println(b);
	}
}
