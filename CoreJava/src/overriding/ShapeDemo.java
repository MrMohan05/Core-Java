package overriding;

public class ShapeDemo 
{
	public static void main(String[] args) 
	{
		Shape s=new Shape();
		s=s.randshape();
		if(s instanceof Circle)
		{
			Circle c=(Circle)s;
			c.draw();
			c.erase();
		}
		else if(s instanceof Triangle)
		{
			Triangle t=(Triangle)s;
			t.draw();
			t.erase();
		}
		else if(s instanceof Square)
		{
			Square sq=(Square)s;
			sq.draw();
			sq.erase();
		}
	}
}
