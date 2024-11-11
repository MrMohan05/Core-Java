package tcs;
import java.util.*;
public class RemoveSpaces 
{
	public static void main(String[] args) 
	{
		String s,r="";
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char []c=s.toCharArray();
		int i=0;
		//s=s.replaceAll("\\s", "");
		for ( i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!=' ')
			{
				r+=s.charAt(i);
			}
		}
		System.out.println("String without space:"+r);
	}
}
