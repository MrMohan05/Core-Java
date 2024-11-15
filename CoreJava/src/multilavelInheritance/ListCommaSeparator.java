package multilavelInheritance;
import java.util.*;
public class ListCommaSeparator 
{
	public static void main(String[] args) 
	{
		List<String> s = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a list");
		String str=sc.nextLine();
		String []string=str.split(",");
		for(String s1:string)
		{
			if(s1.contains("ab") && s1.length()>4)
			{
				s.add(s1);
			}
		}
		System.out.println(s);
		sc.close();
	}
}
