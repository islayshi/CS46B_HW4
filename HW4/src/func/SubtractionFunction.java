package func;

public class SubtractionFunction implements DoubleFunctionOfTwoInts {

	@Override
	//return the difference between x minus y
	public double fOfXY(int x, int y)
	{
		return x - y;
	}
	
	
	@Override
	public String getName() {
		return "SubtractionFunction";
	}

}
