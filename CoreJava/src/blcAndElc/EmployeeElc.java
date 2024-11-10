package blcAndElc;

public class EmployeeElc
{
	public static void main(String args[])
	{
		Employee e1=Employee.validate("Mohan",20,"devlper",50000,"good");
		System.out.println(e1.disp());
		double us=e1.updateSalary();
		System.out.println(e1.disp());
		e1.setage(24);
		e1.setdepartment("HR");
		e1.setname("Supekar");
		e1.setperformance("Average");
		e1.setsalary(120000);
		System.out.println("New data\n");
		System.out.println(e1.disp());
		us=e1.updateSalary();
		e1.setsalary(us);
		System.out.println(e1.disp());
//		System.out.println(e1.getage());
//		System.out.println(e1.getdepartment());
//		System.out.println(e1.getname());
//		System.out.println(e1.getperformance());
//		System.out.println(e1.getsalary());
	}
}
