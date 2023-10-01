package interview;

public class Palindrome {
	public static void main(String[] args) {
		String input = "madam";
		if (isPalindrome(input)) {
			System.out.println(input + " is a Palindrome");
		} else {
			System.out.println(input + " is not Palindrome");
		}

	}
// Function to check if a String is Palindrome or not
	private static boolean isPalindrome(String input) {
		int length = input.length();
		for (int i = 0; i <= length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
