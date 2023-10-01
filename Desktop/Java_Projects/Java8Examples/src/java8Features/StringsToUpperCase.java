package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToUpperCase {
	public static void main(String[] args) {
		// Write a Java 8 lambda expression to convert a list of strings to uppercase.
		
		List<String> strings = Arrays.asList("harsha","arya","vamsi","ravi");
		List<String> listOfStrings = strings.stream().map(String:: toUpperCase).collect(Collectors.toList());
		System.out.println("UpperCase: "+listOfStrings);
	}

}
