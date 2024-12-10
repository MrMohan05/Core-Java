package abstraction;

public class StudentTester 
{
	public static void main(String[] args) 
	{
		Student s=null;
		s=new ScienceStudent(90,80,70,"10","ABC");
		System.out.println("Name : "+s.studentName+" Class : "+s.studentClass);
		System.out.println("Science student marks : "+s.getPercentage());
		System.out.println("Total count : "+Student.getTotalNoStudents());
		s=new HistoryStudent(90,80,"12","XYZ");
		System.out.println("Name : "+s.studentName+" Class : "+s.studentClass);
		System.out.println("History student marks : "+s.getPercentage());
		System.out.println("Total count : "+Student.getTotalNoStudents());
	}
}
