package multilavelInheritance;
import java.util.Scanner;
public class CallingEbook 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Title of Book=");
		String t=sc.nextLine();
		System.out.print("Enter Author of Book=");
		String a=sc.nextLine();
		System.out.print("Enter Fileformat of Book=");
		String f=sc.nextLine();
		Ebook e=new Ebook(t,a,f);
		e.displayEbookInfo();
		sc.close();
	}
}
