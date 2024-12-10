package abstraction;

public class Bread extends Food
{
	String type;
	public Bread(double proteins, double fats, double carbs) 
	{
		super.proteins=proteins;
		super.fats=fats;
		super.carbs=carbs;
		super.tastyScore = 8;
		type = "vegetarian";
	}
	@Override
	void getMacroNutrients()
	{
		System.out.println(" A slice of bread has "+super.proteins+" gms of protein, "+super.fats+" gms of fats and "+super.carbs+" gms of carbohydrates.");
	}
	String getType()
	{
		return type;
	}
	double getTaste()
	{
		return super.tastyScore;
	}
	double getMacros()
	{
		return super.fats;
	}
}
