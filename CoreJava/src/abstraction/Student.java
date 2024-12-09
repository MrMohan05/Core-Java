package abstraction;

public abstract class Student
{
	protected String studentClass;
	protected String studentName;
	protected static int totalNoOfStudents=10;
	
	Student()
	{
	}
	
	Student(String studentClass,String studentName)
	{
		this.studentClass=studentClass;
		this.studentName=studentName;
		totalNoOfStudents+=1;
	}
	
	public abstract int getPercentage();
	
	public static int getTotalNoStudents()
	{
		return totalNoOfStudents;
	}
}
