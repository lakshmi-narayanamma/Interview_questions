package interview;

public class ReverseString {
	public static void main(String[] args) {
		String input = "Hello HariPrasad!";
		String reverseString = reverseString(input);
		System.out.println(reverseString);

	}

	private static String reverseString(String input) {
		StringBuilder builder = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			builder.append(input.charAt(i));
		}
		return builder.toString();
	}

}
