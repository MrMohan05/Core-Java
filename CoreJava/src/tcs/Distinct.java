package tcs;
import java.util.*;
public class Distinct 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 2 arrys");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter 1st array elemnts:");
		int a[]=new int[n],b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array elemnts:");
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				System.out.println(a[i]+" ");
				i++;
			}
			else if(a[i]>b[j])
			{
				System.out.println(b[i]+" ");
				j++;
			}
			else
			{
				i++;
				j++;
			}
		}
		while (i < a.length)
        {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < b.length) 
        {
            System.out.print(b[j] + " ");
            j++;
        }
	}
}
