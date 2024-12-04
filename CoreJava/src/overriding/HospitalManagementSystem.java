package overriding;

public class HospitalManagementSystem 
{
	public static void main(String args[])
	{
		Doctor d=new Doctor("MS","XYZ",25,"Doctor");
		Nurse n=new Nurse(10,"ABC",40,"Nurse");
		d.work();
		n.work();
	}
}
