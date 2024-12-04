package overriding;

public class CreditCardPayment extends Payment
{
	@Override
	public void processPayment()
	{
		super.processPayment();
		System.out.println("Processing credit card payment");
	}
}
