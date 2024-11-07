package blcAndElcClasses;

public class Eblc 
{
	private String ename;
	private int eid;
	private String eadd;
	private double esal;
	private long emob;
	private int exp;
	public void setdata(String ename,int eid,String eadd,double esal,long emob,int exp)
	{
		this.eadd=eadd;
		this.eid=eid;
		this.emob=emob;
		this.ename=ename;
		this.esal=esal;
		this.exp=exp;
	}
	public double calculate()
	{
		if(exp>=3 && exp<=5)
		{
			esal+=3000;
		}
		else if(exp>=5 && exp<=7)
		{
			esal+=5000;
		}
		else if(exp>=7)
		{
			esal+=7000;
		}
		return esal;
	}
	public void disp()
	{
		System.out.println("ename="+ename+"eid="+eid+"eadd="+eadd+"esal="+esal+"emob="+emob+"exp="+exp);
	}
}
