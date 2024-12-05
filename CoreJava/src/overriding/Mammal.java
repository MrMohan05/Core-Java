package overriding;

public class Mammal extends Animal
{
	boolean hasFur;
	Mammal(boolean hasFur,String species)
	{
		super(species);
		this.hasFur=hasFur;
	}
	@Override
	public void makeSound()
	{
		System.out.println(this.getSpecies()+" animal sound");
	}
	@Override
	public String toString() 
	{
		return "Animal [species=" + species + "]";
	}
	@Override
	public  Mammal reproduce()
	{
		System.out.println("Mammals give birth to live young.");
		return new Mammal(this.hasFur,this.getSpecies());
	}
	public void nurseYoung()
	{
		System.out.println("Mammal nursing theire live younds");
	}
}
