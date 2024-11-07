package blcAndElcClasses;

public class StudentElc 
{
	public static void main(String args[])
	{
		StudentBlc s=new StudentBlc();
		s.setStudentData(101,"mohan",95);
		s.calculateGrade();
		System.out.println(s.displayDetails());
	}
}
