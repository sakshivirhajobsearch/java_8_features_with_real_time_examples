package java_04_streams_76;

//Java program to create Stream from Collections
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Java_10I_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static void getStream(List<String> list, Pattern p) {

		list.stream().filter(p.asPredicate()).forEach(System.out::println);
	}

	public static void main(String[] args) {

		// Create ArrayList of String
		// that is backed by the specified array
		List<String> list = Arrays.asList("Geeks", "For", "Geek", "GeeksForGeeks", "A Computer Portal");

		// Get the pattern
		Pattern p = Pattern.compile("^G");

		// Get the Stream from the List matching Pattern
		getStream(list, p);
	}
}