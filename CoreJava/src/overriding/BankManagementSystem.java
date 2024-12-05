package overriding;

public class BankManagementSystem
{
	public static void main(String[] args) 
	{
		SavingsAccount s=new SavingsAccount(10.5,"8520963",55000);
		SavingsAccount s2=s.generateStatement();
		s2.generateStatement();
	}
}
