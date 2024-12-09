package abstraction;

public class StudentTester 
{
	public static void main(String[] args) 
	{
		Student s=null;
		s=new ScienceStudent(90,80,70);
		System.out.println("Science student marks : "+s.getPercentage());
		s=new HistoryStudent(90,80);
		System.out.println("History student marks : "+s.getPercentage());
	}
}
