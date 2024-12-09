package abstraction;

import java.util.Scanner;

public class BookTester 
{
	public static void main(String... args)
	{
		Book b=new MyBook();
		System.out.print("Enter name of the book : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		b.setTitle(name);
		System.out.println(b.getTitle());
		sc.close();
	}
}
