package overriding;

public class Nurse extends HospitalStaff
{
	private int yearsOfExperience;
	Nurse(int yearsOfExperience,String name, int age, String role) 
	{
		super(name, age, role);
		this.yearsOfExperience=yearsOfExperience;
	}
	@Override
	public void work()
	{
		super.work();
		System.out.println("years of experience is taking care of patients."+yearsOfExperience);
	}
	
}
