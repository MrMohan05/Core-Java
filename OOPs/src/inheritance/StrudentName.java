package inheritance;
import java.util.Scanner;
class Student
{
	String name;
	int id;
	char div;
	float fees;
	static int a[]=new int[5];
	static int sum=0;
	static void cheackingResult()
	{
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
		}
	}
	static void disp()
	{
		System.out.println("Sum of marks is="+sum);
	}
}
public class StrudentName extends Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter std name:");
		Student p=new Student();
		p.name=sc.nextLine();
		System.out.println("Enter std id:");
		p.id=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter "+(i+1)+" marks:");
			a[i]=sc.nextInt();
		}
		cheackingResult();
		disp();
		sc.close();
	}
}
