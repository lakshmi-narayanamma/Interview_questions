package interview;

public class LargestElementInAnArray {
	public static void main(String[] args) {
		int[] aray = { 1, 3, 5, 7, 90, 32, 45, 67 };
		int findLargest = findLargest(aray);
		System.out.println("Largest element in an Array is: " + findLargest);
	}

	private static int findLargest(int[] array) {
		int largest = Integer.MIN_VALUE;
		for (int num : array) {
			if (num > largest) {
				largest = num;
			}
		}
		return largest;
	}

}
