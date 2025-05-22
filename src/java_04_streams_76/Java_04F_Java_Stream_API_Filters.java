package java_04_streams_76;

import java.util.stream.Stream;

public class Java_04F_Java_Stream_API_Filters {

	public static void filterByCustomProperties() {
		// create a string array
		String[] myArray = new String[] { "madam", "please", "refer", "link", "on", "racecar" };

		// filter using a custom method
		Stream.of(myArray).filter(x -> palindrome(x)).forEach(System.out::println);
	}

	// checks if palindrome or not
	public static boolean palindrome(String s) {
		if (s.length() <= 1)
			return true;
		else
			return (s.charAt(0) == s.charAt(s.length() - 1)) && palindrome(s.substring(1, s.length() - 1));
	}

	public static void main(String[] args) {
		filterByCustomProperties();
	}
}