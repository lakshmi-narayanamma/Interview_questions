package interview;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// printing the prime numbers from 1 to 100
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int limit = s.nextInt();
		int count = 0;
		System.out.println("Prime numbers between 1 and " + limit + " are:");
		for (int number = 2; number <= limit; number++) {
			if (isPrime(number)) {

				System.out.print(number + " ");
				count++;
			}
			
		}
		System.out.println("\nCount of PrimeNumbers from 1 to "+limit +" are: " + count);
		s.close();
	}

	/**
	 * A prime number is a number that is only divisible by 1 and itself, with no
	 * remainder Here are a few examples of prime numbers: 2, 3, 5, 7, 11, 13, 17,
	 * 19, 23, and so on.
	 */
	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
