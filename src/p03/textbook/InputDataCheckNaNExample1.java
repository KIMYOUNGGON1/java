package p03.textbook;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double Val = Double.valueOf(userInput);
		
		double currentBalance = 1000.0;
		
		currentBalance += Val;
		System.out.println(currentBalance);
	}
}
