package blcAndElcClasses;

public class StudentBlc 
{
	private int studentId;
	private String studentName;
	private int marks;
	private char grade;
	public void setStudentData(int studentId,String studentName,int marks)
	{
		this.marks=marks;
		this.studentName=studentName;
		this.studentId=studentId;
		calculateGrade();
	}
	public void calculateGrade()
	{
		if(marks>90)
		{
			grade='A';
		}
		else if(marks>80)
		{
			grade='B';
		}
		else if(marks>70)
		{
			grade='C';
		}
		else if(marks>60)
		{
			grade='D';
		}
		else
		{
			grade='E';
		}
	}
	public String displayDetails()
	{
		return ("name="+studentName+" studentId="+studentId+ " marks="+marks+" grade="+grade);
	}
}
