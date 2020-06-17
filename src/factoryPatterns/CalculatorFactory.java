package factoryPatterns;

public class CalculatorFactory {

	public Calculator getCalculator(CalculatorEnum calculator) {
		if (calculator == null)
			return new NullClass();
		if (calculator == CalculatorEnum.IPHONE)
			return new Iphone();
		else if (calculator == CalculatorEnum.SAMSUNG)
			return new Samsung();
		else
			return new NullClass();
	}

}
