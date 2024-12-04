package overriding;

public class PayPalPayment extends Payment
{
	@Override
	public void processPayment()
	{
		super.processPayment();
		System.out.println("Processing PayPal payment");
	}
}
