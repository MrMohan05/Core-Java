package blcAndElcClasses;

public class Book 
{
	public String title;
	public String author;
	public double price;
	public Book(String title,String author,double price)
	{
		this.author=author;
		this.price=price;
		this.title=title;
	}
	public void printDetails()
	{
		System.out.println("Title of book="+title);
		System.out.println("author of book="+author);
		System.out.println("price of book="+price);
		//System.out.println("price of book after discount="+dprice);
	}
	public void applyDiscount(double discountPercentage)
	{
		price-=(price*(discountPercentage/100));
	}
}
