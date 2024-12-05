package overriding;

public class Bird extends Animal
{
	boolean canFly;
	Bird(boolean canFly,String species)
	{
		super(species);
		this.canFly=canFly;
	}
	@Override
	public void makeSound() 
	{
		super.makeSound();
	}
	@Override
	public String toString() 
	{
		return super.toString();
	}
	@Override
	public Bird reproduce() 
	{
		System.out.println("Birds lay eggs as a means of reproduction.");
		return new Bird(this.canFly,this.getSpecies());
	}
	public void buildNest()
	{
		System.out.println("building nests for their eggs");
	}
}
