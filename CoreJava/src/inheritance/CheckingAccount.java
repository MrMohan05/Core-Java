package inheritance;

public class CheckingAccount extends BankAccount
{
	double overdraftLimit;
	CheckingAccount(int accountNumber,double balance,double overdraftLimit)
	{
		super(accountNumber,balance);
		this.overdraftLimit=overdraftLimit;
	}
	void withdraw(double amount)
	{
		if(amount>this.overdraftLimit)
		{
			System.err.println("Amount should be less than overdraftLimit!");
		}
		else
		{
			super.balance-=amount;
			System.out.println("Current balnce:"+super.balance);
		}
	}
}
