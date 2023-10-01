package interview;

public class FactorialOfANumber {
	public static void main(String[] args) {
		int number = 10;
		int factorialValue = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is : " + factorialValue);
	}

	private static int calculateFactorial(int number) {
		if (number == 0) {
			return 1;
		}
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;

		}
		return factorial;
	}

}
