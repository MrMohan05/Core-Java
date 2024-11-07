package blcAndElcClasses;
public class product 
{
	public static void main(String args[])
	{
		productBlc p=new productBlc();
		
		p.setProductData();
		System.out.println("Values are set");
		p.getProductInfo();
	}
}
