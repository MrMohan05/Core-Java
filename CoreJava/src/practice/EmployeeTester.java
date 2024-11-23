package practice;
class Employee
{
    private String name;
    private int id;
    private double salary;
    Employee()
    {
    }
    Employee(String name,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    double calculateSalar()
    {
        return salary;
    }
}

class Developer extends Employee
{
    private double hra;
    Developer()
    {
    }
    Developer(String name,int id,double salary,double hra)
    {
        super(name,id,salary);
        this.hra=hra;
    }
    void calculateSalary()
    {
        System.out.println("Total salary="+(hra+super.calculateSalar()));
    }
}
class Manager extends Employee
{
    private double ta;
    private double foodAllowance;
    Manager()
    {
    }
    Manager(String name,int id,double salary,double ta,double foodAllowance)
    {
        super(name,id,salary);
        this.ta=ta;
        this.foodAllowance=foodAllowance;
    }
    void calculateSalary()
    {
        System.out.println("Total salary="+(ta+foodAllowance+super.calculateSalar()));
    }
}
public class EmployeeTester
{
    public static void main(String args[])
    {
        Developer d=new Developer("Mohan",121,5000,500);
        Manager m=new Manager("Mohan",121,5000,500,500);
        d.calculateSalary();
        m.calculateSalary();
    }
}
