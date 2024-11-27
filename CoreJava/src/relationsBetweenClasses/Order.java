package relationsBetweenClasses;

public class Order 
{
	private String orderId;
	private String productName;
	public Order(String orderId, String productName) 
	{
		this.orderId = orderId;
		this.productName = productName;
	}
	public String toString()
	{
		return "order id : "+orderId+" Product name : "+productName;
	}
}
