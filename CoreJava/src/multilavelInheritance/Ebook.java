package multilavelInheritance;

public class Ebook extends Book
{
	String fileFormat;
	Ebook(String title,String author,String fileFormat)
	{
		super(title,author);
		this.fileFormat=fileFormat;
	}
	void displayEbookInfo()
	{
		displayBookInfo();
		System.out.print(" File Formate="+fileFormat);
	}
}
