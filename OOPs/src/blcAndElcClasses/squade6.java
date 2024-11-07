package blcAndElcClasses;
import java.util.*;
public class squade6 
{
	int members;
	String []names;
	long[] number;
	public void get()
	{
		int i=0;
		try (Scanner sc = new Scanner(System.in)) {
			names=new String[6];
			number=new long[6];
			for(;i<=2;i++)
			{
				System.out.print("Enter "+(i+1)+" name:");
				names[i]=sc.nextLine();
				System.out.print("Enter "+(i+1)+" mobile Number:");
				number[i]=sc.nextLong();
				sc.nextLine();
			}
			sc.close();
		}
	}
	public void disp()
	{
		for(int i=0;i<=2;i++)
		{
			System.out.print(names[i]);
			System.out.println(" "+number[i]);
		}
	}
}
