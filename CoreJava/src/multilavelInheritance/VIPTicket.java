package multilavelInheritance;

public class VIPTicket extends Ticket
{
	private String specialAccess;
	VIPTicket(String eventName,int seatNumber,double price,String specialAccess)
	{
		super(eventName,seatNumber,price);
		this.specialAccess=specialAccess;
	}
	
	public String getSpecialAccess() 
	{
		return specialAccess;
	}
	public void setSpecialAccess(String specialAccess) 
	{
		this.specialAccess = specialAccess;
	}
	
}
