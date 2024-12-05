package overriding;

public class SavingsAccount extends Account
{
	double interestRate;
	SavingsAccount(double interestRate,String account,double balance)
	{
		super(account,balance);
		this.interestRate=interestRate;
	}
	@Override
	public SavingsAccount generateStatement() {
		System.out.println("Intrest rate : "+this.interestRate);
		super.generateStatement();
		return new SavingsAccount(this.interestRate,this.accountNumber,this.balance);
	}
	
}
