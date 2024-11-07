package blcAndElcClasses;

public class empBlc
{
	int eid;
	String ename;
	double sal;
	public void setEmployeeData(int n,String s,double d)
	{
		eid=n;
		ename=s;
		sal=d;
		System.out.println("Values are set");
	}
	public void getEmployeeData()
	{
		System.out.println("emp id="+eid+"\nemp name="+ename+"\nemp sal="+sal);

	}
}
