package abstraction;

public class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	
	ScienceStudent(int physicsMarks,int chemistryMarks,int mathMarks)
	{
		if((physicsMarks>100 || physicsMarks<0) || (chemistryMarks>100 || chemistryMarks<0) || (mathMarks>100 || mathMarks<0))
		{
			return;
		}
		this.chemistryMarks=chemistryMarks;
		this.mathMarks=mathMarks;
		this.physicsMarks=physicsMarks;
	}
	
	public int getPercentage()
	{
		return (physicsMarks+chemistryMarks+mathMarks)/3;
	}
}
