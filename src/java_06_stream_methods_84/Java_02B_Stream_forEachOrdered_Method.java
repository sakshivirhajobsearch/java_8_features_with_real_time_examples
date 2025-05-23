package java_06_stream_methods_84;

//Java code for forEachOrdered
//(Consumer action) in Java 8
import java.util.Arrays;
import java.util.List;

public class Java_02B_Stream_forEachOrdered_Method {

	public static void main(String[] args) {

		// Creating a list of Strings
		List<String> list = Arrays.asList("GFG", "Geeks", "for", "GeeksforGeeks");

		// Using forEachOrdered(Consumer action) to
		// print the elements of stream in encounter order
		list.stream().forEachOrdered(System.out::println);

	}
}