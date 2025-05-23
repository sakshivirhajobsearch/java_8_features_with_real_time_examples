package java_06_stream_methods_84;

//Java Program to demonstrate Working of joining() Method
//of Collectors Class

//Importing required classes
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_26B_Collectors_joining_Method_With_Examples {

	public static void main(String[] args) {
		
		// Creating a character list
		List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's');

		// Converting character list into string
		// using joining() method of Collectors class
		String chString = ch.stream().map(String::valueOf).collect(Collectors.joining());

		// Printing the concatenated string
		System.out.println(chString);
	}
}