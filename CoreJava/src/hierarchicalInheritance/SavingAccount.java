package hierarchicalInheritance;

public class SavingAccount extends BankAccount
{
	double interestRate;
	SavingAccount(int accountNumber,double balance,double intrestRate)
	{
		super(accountNumber,balance);
		this.interestRate=intrestRate;
	}
	void addInterest()
	{
		super.balance=super.balance+(super.balance*(interestRate/100));
		System.out.println("Current balnce:"+super.balance);
	}
	
}
