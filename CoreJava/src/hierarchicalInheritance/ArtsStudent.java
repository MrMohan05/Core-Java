package hierarchicalInheritance;

public class ArtsStudent extends Student
{
	int historyMarks;
	int geographyMarks;
	int englishMarks;
	ArtsStudent(String name,int rollNumber,int historyMarks, int geographyMarks, int englishMarks)
	{
		super(name,rollNumber);
		this.englishMarks=englishMarks;
		this.geographyMarks=geographyMarks;
		this.historyMarks=historyMarks;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("History marks="+historyMarks+"\nGeography marks="+geographyMarks+"\nEnglish marks="+englishMarks);
	}
	@Override
	public double calculatePercentage()
	{
		return (historyMarks+geographyMarks+englishMarks)/3.0;
	}
}
