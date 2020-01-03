package func;

public class ModFunction implements DoubleFunctionOfTwoInts {

	@Override
	//return x%y
	public double fOfXY(int x, int y) {
		//because % 0 is illegal, change y to 1 if it does equal 0
		if (y == 0)
			y = 1;

		return x % y;
	}

	@Override
	public String getName() {
		return "ModFunction";
	}

}
