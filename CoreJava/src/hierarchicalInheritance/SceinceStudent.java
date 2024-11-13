package hierarchicalInheritance;

public class SceinceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	SceinceStudent(String name,int rollNumber,int physicsMarks,int chemistryMarks,int mathMarks)
	{
		super(name,rollNumber);
		this.chemistryMarks=chemistryMarks;
		this.mathMarks=mathMarks;
		this.physicsMarks=physicsMarks;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("physics Marks="+physicsMarks+"\nchemistry Marks="+chemistryMarks+"\nmath Marks="+mathMarks);
	}
	@Override
	public double calculatePercentage() {
		int totalMarks = physicsMarks + chemistryMarks + mathMarks;
        return (totalMarks / 3.0); 
		
	}
	
	
}
