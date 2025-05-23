package java_06_stream_methods_84;

//Java code for forEach
//(Consumer action) in Java 8
import java.util.Arrays;
import java.util.List;

public class Java_01B_Stream_forEach_Method {

	public static void main(String[] args) {

		// Creating a list of Strings
		List<String> list = Arrays.asList("GFG", "Geeks", "for", "GeeksforGeeks");

		// Using forEach(Consumer action) to
		// print the elements of stream
		list.stream().forEach(System.out::println);
	}
}