package multilavelInheritance;

public class LibraryItem 
{
	String title;
	LibraryItem(String title)
	{
		this.title=title;
	}
	void displayInfo()
	{
		System.out.print("Title="+title);
	}
}
