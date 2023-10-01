package java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamApi {
	public static void main(String[] args) {
		// Printing even Numbers using Java_8

		List<Integer> numbers = Arrays.asList(1, 23, 3, 5, 6, 90, 23, 13, 3, 6);
		System.out.println("====Even Numbers=======");
		numbers.stream().filter(x -> x % 2 == 0).distinct().forEach(output -> System.out.print(output + " "));
		System.out.println("\n=======Squaring of each Number======");
		numbers.stream().map(x -> x * x).forEach(output -> System.out.print(output + " "));
		System.out.println("\n======Printing unique elements=======");
		numbers.stream().distinct().forEach(output -> System.out.print(output + " "));
		System.out.println("\n=====Ascending Order=======");
		numbers.stream().distinct().sorted().forEach(output -> System.out.print(output + " "));
		System.out.println("\n==========Descending Order=========");
		numbers.stream().sorted(Collections.reverseOrder()).forEach(output -> System.out.print(output + " "));
	}

}
