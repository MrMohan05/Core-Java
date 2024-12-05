package overriding;

public class Animal 
{
	String species;
	
	public Animal(String species) 
	{
		this.species = species;
	}

	public String getSpecies() 
	{
		return species;
	}
	
	public void makeSound()
	{
		System.out.println("generic animal sound");
	}

	public String toString() 
	{
		return "Animal [species=" + species + "]";
	}

	public  Animal reproduce()
	{
		System.out.println("Generic reproduction method for all animals");
		return new Animal(this.species);
	}
	
}
