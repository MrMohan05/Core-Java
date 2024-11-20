package inheritance;

public class BankAccount 
{
	int accountNumber;
	double balance;
	BankAccount(int accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	void deposite(double amount)
	{
		balance+=amount;
	}
	void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.err.println("Amount should be less than Balance!");
		}
		else
		{
			balance-=amount;
			System.out.println("Current balnce:"+balance);
		}
	}
}
