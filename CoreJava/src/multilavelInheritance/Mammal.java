package multilavelInheritance;

public class Mammal extends Animal
{
	private boolean hasFur;
	Mammal(String name,boolean hasFur)
	{
		super(name);
		this.hasFur=hasFur;
	}
	public void setFur(boolean hasFur)
	{
		this.hasFur=hasFur;
	}
	public boolean getFur()
	{
		return hasFur;
	}
	@Override
	public void display()
	{
		System.out.println("Name is="+super.getName());
		System.out.println("Having fur="+hasFur);
	}
}
