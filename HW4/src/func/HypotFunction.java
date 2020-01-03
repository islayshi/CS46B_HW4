package func;

public class HypotFunction implements DoubleFunctionOfTwoInts {
	
	@Override
	//should return the hypotenuse of a right triangle whose legs have
	//length x and y
	public double fOfXY(int x, int y)
	{
		// square root of x^2 + y^2
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	@Override
	public String getName() {
		return "HypotFunction";
	}

}
