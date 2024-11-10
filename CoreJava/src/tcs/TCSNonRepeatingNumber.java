package tcs;
import java.util.*;
public class TCSNonRepeatingNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		ArrayList<Integer> a2=new ArrayList();
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a2.add(sc.nextInt());
		}
		System.out.println(a2);
		a2=new ArrayList<>(new LinkedHashSet<>(a2));
		System.out.println(a2);
	}
}
