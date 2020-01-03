package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts {
	
	@Override
	// x and y components represent x + bi again
	//return the norm of (x+bi)*(x+bi).
	public double fOfXY(int x, int y) {
		return (Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	@Override
	public String getName() {
		return "ComplexSquaredNormFunction";
	}

}
