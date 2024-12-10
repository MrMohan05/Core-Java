package abstraction;

public class Egg extends Food
{
	String type;
	public String getType()
	{
		return type;
	}
	public Egg(double proteins, double fats, double carbs) 
	{
		super.proteins=proteins;
		super.fats=fats;
		super.carbs=carbs;
		super.tastyScore = 7;
		type = "non-vegetarian";
	}

	@Override
	void getMacroNutrients() 
	{
		System.out.println("An egg has "+super.proteins+" gms of protein "+super.fats+" gms of fats and "+super.carbs+" gms of carbohydrates.");
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
