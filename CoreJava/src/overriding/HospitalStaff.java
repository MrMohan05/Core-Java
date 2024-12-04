package overriding;

public class HospitalStaff 
{
	private String name;
	private int age;
	private String role;
	HospitalStaff(String name,int age,String role)
	{
		this.age=age;
		this.name=name;
		this.role=role;
	}
	public void work()
	{
		System.out.println("Role : "+role+" Age :"+age+" Name : "+name+" Is working :");
	}
}
