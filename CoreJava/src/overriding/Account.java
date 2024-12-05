package overriding;

public class Account 
{
	String accountNumber;
	double balance;
	
	public Account(String accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	public double balance()
	{
		return this.balance;
	}
	public Object generateStatement()
	{
		System.out.println("Account number : "+this.accountNumber+" Current balance : "+this.balance);
		return new Account(this.accountNumber,this.balance);
	}
}
