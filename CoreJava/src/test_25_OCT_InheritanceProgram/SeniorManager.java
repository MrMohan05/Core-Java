package test_25_OCT_InheritanceProgram;

public class SeniorManager extends Manager
{
	int numTeams;
	SeniorManager(String name,int id,String department,int numTeams)
	{
		super(name,id,department);
		this.numTeams=numTeams;
	}
	void handleMultipleTeams()
	{
		super.manageTeam();
		System.out.println("Number of teams managaed : "+numTeams);
	}
}
