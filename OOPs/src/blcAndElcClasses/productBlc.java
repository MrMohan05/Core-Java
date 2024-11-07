package blcAndElcClasses;

import java.util.Scanner;

public class productBlc
{
	int pid;
	String pname;
	double pprice;
	public void setProductData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter product id=");
		pid=(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter product name=");
		pname=(sc.nextLine());
		System.out.print("Enter product price=");
		pprice=(sc.nextDouble());
		sc.close();
	}
	public void getProductInfo()
	{
		System.out.println("Product id="+pid+"\nproduct name="+pname+"\nProduct price="+pprice);
	}
}
