package hierarchicalInheritance;

public class ShapeTester 
{
	public static void main(String[] args) 
	{
		Cylinder cy=new Cylinder(5,5);
		System.out.println("area="+cy.getArea());
		System.out.println("volume="+cy.getVolume());
	}
}
