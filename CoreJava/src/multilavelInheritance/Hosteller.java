package multilavelInheritance;

public class Hosteller extends Student
{
	double hostelFee;
	double hfees=8000;
	public Hosteller(int studentId, String name, double examFee,double hostelFee) 
	{
		super(studentId, name, examFee);
		this.hostelFee=hostelFee;
		if((hfees-hostelFee)<0)
		{
			System.err.println("Negative nalue is not allowed: Hostel fees getting negative="+(hfees-hostelFee));
			System.exit(0);
		}
	}
	@Override
	public String toString()
	{
		return "Hosteller [hostelFee=" + hostelFee + " Hostel reminig fees="+(this.hfees-hostelFee);
	}
	
}
