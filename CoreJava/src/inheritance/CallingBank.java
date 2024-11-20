package inheritance;

public class CallingBank 
{
	public static void main(String[] args) 
	{
		SavingAccount s=new SavingAccount(123,50000,10);
		CheckingAccount c=new CheckingAccount(123,50000,3000);
		s.addInterest();
		s.deposite(5000);
		s.withdraw(10000);
		c.deposite(5000);
		c.withdraw(2500);
	}
}
