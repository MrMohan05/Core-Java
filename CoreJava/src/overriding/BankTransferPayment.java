package overriding;

public class BankTransferPayment extends Payment
{

	@Override
	public void processPayment() 
	{
		super.processPayment();
		System.out.println("Processing bank transfer payment");
	}
}
