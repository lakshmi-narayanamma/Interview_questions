package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		// Write a Java 8 lambda expression to find the sum of all even numbers in a list.
		List<Integer> numbers = Arrays.asList(1, 2, 5, 7, 8, 3, 9, 10);
		int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
		List<Integer> EvenNumbers = numbers.stream().filter(x -> x% 2 ==0).collect(Collectors.toList());
		System.out.println("All Even Numbers: "+EvenNumbers);
		System.out.println("Sum Of EvenNumbers: " + sum);
	}

}
