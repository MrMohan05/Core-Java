package inheritance;

public class JobGuaranteeStudent extends Student1
{
	boolean placementGuarantee;
	JobGuaranteeStudent(int studentId, String name, long mobile,boolean placementGuarantee) 
	{
		super(studentId, name, mobile);
		this.placementGuarantee=placementGuarantee;
	}
	void displayStudentInfo()
	{
		display();
		System.out.println("placement Guarantee:"+placementGuarantee);		
	}
}
