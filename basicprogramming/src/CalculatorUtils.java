
public class CalculatorUtils {
	public static Calculator getCalculator() {
		return new SuperCalculatorImpl();
	}
	public static AdvCalculator getAdvCalculator() {
		return new SuperCalculatorImpl();
	}
	public static FinCalculator getFinCalculator() {
		return new SuperCalculatorImpl();
	}
	public static SuperCalculator getSuperCalculator() {
		return new SuperCalculatorImpl();
	}
}
