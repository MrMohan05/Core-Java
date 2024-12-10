package abstraction;

public class HistoryStudent extends Student
{
	private int historyMarks;
	private int civicsMarks;
	
	HistoryStudent(int historyMarks,int civicsMarks,String studentClass,String studentName)
	{
		super(studentClass,studentName);
		if((historyMarks>100 || historyMarks<0) || (civicsMarks>100 || civicsMarks<0))
		{
			return;
		}
		this.civicsMarks=civicsMarks;
		this.historyMarks=historyMarks;
	}
	
	public int getPercentage()
	{
		return (historyMarks+civicsMarks)/2;
	}
}
