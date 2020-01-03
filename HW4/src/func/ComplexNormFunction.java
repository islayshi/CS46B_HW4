package func;

public class ComplexNormFunction implements DoubleFunctionOfTwoInts{
	
	@Override
	//treat x and y inputs as the components of a complex number x + bi
	//return the norm of the complex number
	public double fOfXY(int x, int y)
	{
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	@Override
	public String getName() {
		return "ComplexNormFunction";
	}
	
	

}
