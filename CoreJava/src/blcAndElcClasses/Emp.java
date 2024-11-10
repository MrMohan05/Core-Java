package blcAndElcClasses;

public class Emp 
{
	String name;
	int id;
	double sal;
	String cmpname;
	
	public void empInfo()
	{
		System.out.println("\nName of the emplyee="+name+"\nCompny name="+cmpname+"\nEmplyee id="+id+"\nEmplyee sal="+sal);
	}
	public void incsal()
	{
		System.out.println("Sal after 10% increment="+((sal*0.1)+sal));
	}
}
