package practice;

class Test1 
{
	String name;
	int id;
	String specialization;
	Test1(String name,int id,String specialization)
	{
		this.id=id;
		this.name=name;
		this.specialization=specialization;
	}
	Test1()
	{
		this.id=0;
		this.name="";
		this.specialization="General";
	}
	void displayDetails()
	{
		System.out.println("Name of teacher="+name);
		System.out.println("id of teacher="+id);
		System.out.println("specialization of teacher="+specialization);
	}
}
class Sub1 extends Test1
{
	private String subjectName;
	Sub1()
	{
		subjectName="Not Assigned";
	}
	Sub1(String name,int id,String specialization,String subjectName)
	{
		super(name,id,specialization);
		this.subjectName=subjectName;
	}
	void displaySubject()
	{
		super.displayDetails();
		System.out.println("Subject name="+subjectName);
	}
}


public class Tes 
{
	public static void main(String[] args) 
	{
		Sub1 s=new Sub1("John Doe",201,"Mathematics","Algebra");
		s.displaySubject();
	}
}


