package blcAndElcClasses;
import java.util.*;
public class BankElc 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter bank name:");
		String bn=sc.nextLine();
		
		System.out.print("Enter bank location:");
		String bl=sc.nextLine();

		System.out.print("Enter bank IFSC code:");
		String ifsc=sc.nextLine();

		System.out.print("Enter customer name:");
		String cn=sc.nextLine();

		System.out.print("Enter account number:");
		long an=sc.nextLong();
		
		System.out.print("Min bal of acc is set to 1000:");
		double bal=1000;
		
		Bank b=new Bank();
		b.setDetails(bn, cn, bl, ifsc, an, bal);
		
		
		boolean l=true;
		while(l)
		{
			System.out.println("Choose 1 for withdraw\nchoose 2 for deposite");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter amt to withdraw");
				bal=sc.nextDouble();
				b.withdraw(bal);
				System.out.println(b.displayDetails());
			}
			else
			{
				System.out.println("Enter amt to deposite");
				bal=sc.nextDouble();
				b.deposit(bal);
				System.out.println(b.displayDetails());
			}
		}
		sc.close();
	}
}
