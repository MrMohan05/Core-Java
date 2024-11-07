package inheritance;
import java.util.Scanner;
class emp extends Person
{
	int id;
	double sal;
	int dno;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		emp e=new emp();
		e.id=sc.nextInt();
		System.out.println("Enter employee sal:");
		e.sal=sc.nextDouble();
		System.out.println("Enter department number:");
		e.dno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name of employee:");
		Person p11=new Person();
		p11.name=sc.nextLine();
		System.out.println("Enter gender of employee:");
		p11.gender=sc.next().charAt(0);
		System.out.println("Is person alive:");
		p11.isAlive=sc.nextBoolean();
		e.disp(p11);
		sc.close();
	}
	void disp(Person p11)
	{
		System.out.println("Emp id="+id+" emp sal="+sal+" emp dno="+dno+" name="+p11.name+" gender="+p11.gender+" is alive="+p11.isAlive);
	}
}
