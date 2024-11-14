package multilavelInheritance;

public class Student 
{
	int studentId; 
	String name; 
	double examFee;
	double efees=1000;
	Student(int studentId, String name,	double examFee)
	{
		this.examFee=examFee;
		this.name=name;
		this.studentId=studentId;
		if((efees-examFee)<0)
		{
			System.err.println("Negative nalue is not allowed:Exam fees is getting negative="+(efees-examFee));
			System.exit(0);
		}
	}
	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee+" Total remainig amt="+(efees-this.examFee);
	}
	
}
