package blcAndElc;

public class InventoryItemElc 
{
	public static void main(String args[])
	{
		InventoryItem i1=new InventoryItem("BMW",10000,5);
		System.out.println("name="+i1.getitemName());
		System.out.println("price Per Unit="+i1.getpricePerUnit());
		System.out.println("quantity In Stock="+i1.getquantityInStock());
		System.out.println("toatl="+i1.cal());
		i1.setiemName("Audy");
		i1.setpricePerUnit(15000);
		i1.setquantityInStock(2);
		System.out.println("\nname="+i1.getitemName());
		System.out.println("price Per Unit="+i1.getpricePerUnit());
		System.out.println("quantity In Stock="+i1.getquantityInStock());
		System.out.println("toatl="+i1.cal());
	}
}
