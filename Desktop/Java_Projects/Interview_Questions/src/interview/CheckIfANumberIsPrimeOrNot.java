package interview;

public class CheckIfANumberIsPrimeOrNot {
	public static void main(String[] args) {
		int number = 35;
		boolean prime = isPrime(number);
		if (prime) {
			System.out.println(number + " is a PrimeNumber");
		} else {
			System.out.println(number + " is not a PrimeNumber");
		}

	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
