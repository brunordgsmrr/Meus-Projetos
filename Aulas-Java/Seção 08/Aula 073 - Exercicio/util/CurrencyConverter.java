package util;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	
	public static double calculator(double dollar, double amount) {
		return dollar * amount;
	}
	
	public static double total(double reais) {
		return reais += reais * 6 / 100;
	}
	
}