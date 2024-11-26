package test_25_OCT_InheritanceProgram;

public class Professor extends Faculty
{
	String researchArea;
	Professor(String name,int id,String department,String researchArea)
	{
		super(name,id,department);
		this.researchArea=researchArea;
	}
	void conductResearch()
	{
		super.teachSubject();
		System.out.println("Reacher are of the Professor="+researchArea);
	}
}
