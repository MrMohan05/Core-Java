package inheritance;
import java.util.Scanner;
public class std extends Person
{
	int clas;
	char div;
	int rollno;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of student:");
		Person p=new Person();
		p.name=sc.nextLine();
		System.out.println("Enter gender of student:");
		p.gender=sc.next().charAt(0);
		System.out.println("Is person alive:");
		p.isAlive=sc.nextBoolean();
		System.out.println("Enter class:");
		std s=new std();
		s.clas=sc.nextInt();
		System.out.println("Enter division:");
		s.div=sc.next().charAt(0);
		System.out.println("Enter roll number:");
		s.rollno=sc.nextInt();
		s.disp(p);
		sc.close();
		emp.main(null);
	}
	void disp(Person p){
		System.out.println("std [clas=" + clas + ", div=" + div + ", rollno=" + rollno + "\nperson name=" + p.name + ", gender=" + p.gender + ", isAlive=" + p.isAlive + "]");
	}
}




























