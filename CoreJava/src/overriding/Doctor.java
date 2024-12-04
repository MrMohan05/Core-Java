package overriding;

public class Doctor extends HospitalStaff
{
	private String specialization;
	Doctor(String specialization,String name,int age,String role)
	{
		super(name,age,role);
		this.specialization=specialization;
	}
	@Override
	public void work()
	{
		super.work();
		System.out.println("specialization :"+specialization);
	}
}
