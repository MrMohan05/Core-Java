package multilavelInheritance;
import java.util.*;
public class CallingManager 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		System.out.print("Enter Age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee ID:");
		String id=sc.nextLine();
		System.out.print("Enter Department Name:");
		String DName=sc.nextLine();
		Manager m=new Manager(DName,id,name,age);
		m.displayManagerInfo();
		sc.close();
	}
}
