package inheritance;

public class Person1 
{
	 String name;
	 int age;
	 void displayDetails(String name,int age)
	 {
		 this.age=age;
		 this.name=name;
		 System.out.println("Name="+name+"\nAge="+age);
	 }
}
