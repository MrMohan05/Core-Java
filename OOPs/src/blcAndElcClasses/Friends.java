package blcAndElcClasses;
import java.util.*;
public class Friends 
{
	String n1;
	String n2;
	int no1;
	int no2;
	public void setdata()
	{
		try (Scanner sc = new Scanner(System.in)) {
			Friends f=new Friends();
			//System.out.println("Enter naem:");
			f.n1=(sc.nextLine());
			//sc.nextLine();
			System.out.println("Enter naem:");
			f.n2=(sc.nextLine());
			//sc.nextLine();
			System.out.println("Enter no:");
			f.no1=(sc.nextInt());
			System.out.println("Enter no:");
			f.no2=(sc.nextInt());
		}		
	}
	public void disp()
	{
		System.out.println("namme 1="+n1);
		System.out.println("number 1="+no1);
		System.out.println("namme 2="+n2);
		System.out.println("number 2="+no2);
	}
	//sc.close();	
}
