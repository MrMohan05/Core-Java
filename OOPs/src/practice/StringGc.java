package practice;

public class StringGc 
{
	String sg=new String("Mohan");
	StringGc s1;
	public void cheack1()
	{
		String name="Supekar";
		
		System.out.println(name);
		System.out.println(sg);
	}
	public static void main(String args[])
	{
		StringGc s=new StringGc();
		s.cheack1();
		s.s1 = new StringGc();
		s.s1=null;
		System.out.println(s.s1.sg);
	}
}
