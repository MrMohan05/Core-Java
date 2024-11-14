package multilavelInheritance;

public class CallingStdent 
{
	public static void main(String[] args) 
	{
		Student s=new Student(101,"Mohan",500);
		DayScholar d=new DayScholar(102, "Amiy", 500, 4000);
		Hosteller h=new Hosteller(103, "vishwajeet", 500,6000);
		System.out.println("Student details");
		System.out.println(s.toString());
		System.out.println("\nDay Scholar details");
		System.out.println(s.toString());
		System.out.println(d.toString());
		System.out.println("\nHosteller details");
		System.out.println(s.toString());
		System.out.println(h.toString());
	}
}
