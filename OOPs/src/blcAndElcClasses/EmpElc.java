package blcAndElcClasses;

public class EmpElc 
{
	public static void main(String args[])
	{
		Emp e1=new Emp();
		e1.cmpname="Tcs";
		e1.id=123;
		e1.name="Mohan";
		e1.sal=22000.52;
		e1.empInfo();
		e1.incsal();
		
		Emp e2=new Emp();
		e2.cmpname="Cognizent";
		e2.id=456;
		e2.name="Supekar";
		e2.sal=20585.96;
		e2.empInfo();
		e2.incsal();

		
	}
}
