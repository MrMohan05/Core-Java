package blcAndElcClasses;

public class squade6Elc 
{
	public static void main(String args[])
	{
		System.out.println("Calling get method");
		squade6 s=new squade6();
		s.get();
		System.out.println("Calling disp method");
		s.disp();
		for(int i=0;i<=2;i++)
		System.out.println(s.names[i]);
		for (String name : s.names) {
            System.out.println(name); // Print each name using enhanced for loop
        }
	}
}
