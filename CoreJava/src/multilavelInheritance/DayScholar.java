package multilavelInheritance;

public class DayScholar extends Student
{
	double transportFee;
	double tfees=5000;
	DayScholar(int studentId, String name,	double examFee,double transportFee)
	{
		super(studentId,name,examFee);
		this.transportFee=transportFee;
		if((tfees-transportFee)<0)
		{
			System.err.println("Negative nalue is not allowed: Transpost fees getting negative="+(tfees-transportFee));
			System.exit(0);
		}
	}
	@Override
	public String toString() 
	{
		return "DayScholar [transportFee=" + transportFee + " Remainig transporst fees="+(this.tfees-transportFee);
	}
	
}
