package multilavelInheritance;

public class CallingTicket 
{
	public static void main(String[] args)
	{
		Ticket t=new Ticket("Cricket",51250,55000);
		VIPTicket vt=new VIPTicket("Cricket",101,150000,"Yes");
		StudentTicket st=new StudentTicket("Cricket",35762,20000,true);
		System.out.println("Ticket INFO");
		System.out.println("Name of the event="+t.getEventName()+"\nPrice of the ticket="+t.getPrice()+"\nSeat number="+t.getSeatNumber());
		System.out.println("VIP Ticket INFO");
		System.out.println("\nName of the evemt="+vt.getEventName()+"\nSeat number="+st.getSeatNumber()+"\nPrice of the ticket="+vt.getPrice()
		+"\nHave VIP Tickit access or not="+vt.getSpecialAccess());
		System.out.println("Student Ticket INFO");
		System.out.println("\nName of the event="+st.getEventName()+"\nSeat number="+st.getSeatNumber()+"\nPrice of the ticket="+st.getPrice()
		+"\nIs student discont applicable="+st.getStudentDiscount());
	}
}
