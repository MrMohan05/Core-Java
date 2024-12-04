package overriding;

public class MakingPayment 
{
	public static void main(String[] args) 
	{
		MakingPayment m=new MakingPayment();
		m.processMultiplePayments(new CreditCardPayment(),new PayPalPayment(),new BankTransferPayment());
	}
	public void processMultiplePayments(Payment ...pay)
	{
		for(Payment p:pay)
		{
			if(p instanceof CreditCardPayment)
			{
				p.processPayment();
				System.out.println();
			}
			else if(p instanceof PayPalPayment)
			{
				p.processPayment();
				System.out.println();
			}
			else if(p instanceof BankTransferPayment)
			{
				p.processPayment();
				System.out.println();
			}
		}
	}
}
