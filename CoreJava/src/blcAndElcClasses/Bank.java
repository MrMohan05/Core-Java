package blcAndElcClasses;

public class Bank 
{
	private String bankName;
	private String cName;
	private String bankLoc;
	private String IFSCCode;
	private long accNumber;
	private double bal=1000;
	
	public void setDetails(String bankName,String cName,String bankLoc,String IFSCCode,long accNumber,double bal)
	{
		this.accNumber=accNumber;
		this.bal=bal;
		this.bankLoc=bankLoc;
		this.bankName=bankName;
		this.cName=cName;
		this.IFSCCode=IFSCCode;
	}
	public void withdraw(double amt)
	{	
		double min=1000;
		if(bal<=min)
		{
			System.out.println("InsufficientBalance");
		}
		if((bal-amt)<=min)
		{
			System.out.println("Maintain MinimumBalance");
		}
		else
		{
			bal=bal-amt;
			System.out.println("Transaction Successful.\nAvailable Balance : Rs."+bal);
		}
		
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		CurrentBalance();
	}
	public void CurrentBalance()
	{
		System.out.println("you are trying to deposit "+bal);
	}
	public String displayDetails() 
	{
		return "Bank [bankName=" + bankName + "\ncName=" + cName + "\nbankLoc=" + bankLoc + "\nIFSCCode=" + IFSCCode
				+ "\naccNumber=" + accNumber + "\nbal=" + bal + "]";
	}
	
}
