package java_06_stream_methods_84;

//Java Program to demonstrate the working
//of the Collectors.joining() method

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Class
public class Java_26A_Collectors_joining_Method_With_Examples {

	public static void main(String[] args) {

		// Creating a custom character array
		char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's' };

		// Converting character array into string
		// using joining() method of Collectors class
		String chString = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining());

		// Printing concatenated string
		System.out.println(chString);
	}
}
