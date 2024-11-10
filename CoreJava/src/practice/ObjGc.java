package practice;

public class ObjGc 
{
	static ObjGc og;
	static ObjGc og1;
	String name;
	int id;
	public static void cheack1()
	{
		og1=new ObjGc();
		og1.name="mohan";
		og1.id=10;
	}
	public static void cheack2()
	{
		og=new ObjGc();
		og.name="supekar";
		og.id=20;
	}
	public static void disp()
	{
		System.out.println(og1.name);
		System.out.println(og1.id);
		System.out.println(og.name);
		System.out.println(og.id);
	}
	public static void main(String args[])
	{
		ObjGc o=new ObjGc();
		System.out.println(o.name+" "+o.id);
		cheack1();
		cheack2();
		disp();
	}
}
