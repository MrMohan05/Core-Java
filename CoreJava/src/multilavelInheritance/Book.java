package multilavelInheritance;

public class Book extends LibraryItem
{
	String author;
	Book(String title,String author)
	{
		super(title);
		this.author=author;
	}
	void displayBookInfo()
	{
		displayInfo();
		System.out.print(" Author Name="+author);
	}
}
