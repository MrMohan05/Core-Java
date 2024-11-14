package multilavelInheritance;

public class Dog extends Mammal
{
	private String breed;
	Dog(String name,boolean hasFur,String breed)
	{
		super(name,hasFur);
		this.breed=breed;
	}
	public void setBreed(String breed)
	{
		this.breed=breed;
	}
	public String getBreed()
	{
		return breed;
	}
	@Override
	public void display()
	{
		System.out.println("Name of dof is="+super.getName());
		System.out.println("Brred of the dog is ="+breed);
		if(super.getFur()==true)
		{
			System.out.println("Does dog having fur=Yes");
		}
		else
			System.out.println("Does dog having fur=NO");
		
	}
}