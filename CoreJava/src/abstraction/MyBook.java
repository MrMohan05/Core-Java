package abstraction;

public class MyBook extends Book
{
	@Override
	public void setTitle(String title)
	{
		super.title=title;
	}
	
	@Override
	public String getTitle()
	{
		return "The title of my book is : "+super.getTitle();
	}
}
