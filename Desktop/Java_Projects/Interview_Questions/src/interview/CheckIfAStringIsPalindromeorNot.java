package interview;

public class CheckIfAStringIsPalindromeorNot {
	public static void main(String[] args) {
		String input = "malayalam";
		boolean palindrome = isPalindrome(input);
		if (palindrome) {
			System.out.println(input + " is a Palindrome");
		} else {
			System.out.println(input + " is not a Palindrome");
		}

	}

	private static boolean isPalindrome(String input) {
		int length = input.length();
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
