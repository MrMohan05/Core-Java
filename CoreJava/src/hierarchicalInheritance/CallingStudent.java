package hierarchicalInheritance;

public class CallingStudent 
{
public static void main(String[] args) 
{
	SceinceStudent sci=new SceinceStudent("Mohan",67,80,75,66);
	sci.displayDetails();
	System.out.println(sci.calculatePercentage());
	ArtsStudent arts=new ArtsStudent("mohan",66,50,5,95);
	System.out.println("\n");
	arts.displayDetails();
	System.out.println(arts.calculatePercentage());
}
}
