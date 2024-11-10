package inheritance;

public class Student1 
{
	int studentId;
	String name;
	long mobile;
	Student1(int studentId,String name,long mobile)
	{
		this.mobile=mobile;
		this.name=name;
		this.studentId=studentId;
	}
	Student1()
	{
	}
	void display()
	{
		System.out.println("Student id="+studentId+"\nName="+name+"\nMobile="+mobile);
	}
}
