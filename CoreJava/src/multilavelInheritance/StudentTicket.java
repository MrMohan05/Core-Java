package multilavelInheritance;

public class StudentTicket extends Ticket
{
	private boolean studentDiscount;
	
	StudentTicket(String eventName,int seatNumber,double price,boolean studentDiscount)
	{
		super(eventName,seatNumber,price);
		this.studentDiscount=studentDiscount;
	}

	public boolean getStudentDiscount() 
	{
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) 
	{
		this.studentDiscount = studentDiscount;
	}	
}
