package blcAndElc;

public class InventoryItem
{
	String itemName;     	 
	double pricePerUnit;  	 
	int quantityInStock;
	public InventoryItem (String itemName,double pricePerUnit,int quantityInStock)
	{
		this.itemName=itemName;
		this.pricePerUnit=pricePerUnit;
		this.quantityInStock=quantityInStock;
	}
	public void setiemName(String itemName)
	{
		this.itemName=itemName;
	}
	public void setpricePerUnit(double pricePerUnit)
	{
		this.pricePerUnit=pricePerUnit;
	}
	public void setquantityInStock(int quantityInStock)
	{
		this.quantityInStock=quantityInStock;
	}
	public String getitemName()
	{
		return itemName;
	}
	public double getpricePerUnit()
	{
		return pricePerUnit;
	}
	public int getquantityInStock()
	{
		return quantityInStock;
	}
	public double cal()
	{
		//int a=0,b=0,c=0;
		if(quantityInStock<0 || pricePerUnit<0 || itemName.equals(""))
		{
			System.err.println("Error message indicating invalid");
			return 0;
		}
		else
		return quantityInStock*pricePerUnit;
	}
}


















