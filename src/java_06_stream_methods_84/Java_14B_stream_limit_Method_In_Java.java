package java_06_stream_methods_84;

import java.util.ArrayList;
import java.util.List;
//Java code to show the use of limit() function
import java.util.stream.Stream;

public class Java_14B_stream_limit_Method_In_Java {

	// Function to limit the stream upto given range, i.e, 3
	public static Stream<String> limiting_func(Stream<String> ss, int range) {
		return ss.limit(range);
	}

	public static void main(String[] args) {

		// list to save stream of strings
		List<String> arr = new ArrayList<>();

		arr.add("geeks");
		arr.add("for");
		arr.add("geeks");
		arr.add("computer");
		arr.add("science");

		Stream<String> str = arr.stream();

		// calling function to limit the stream to range 3
		Stream<String> lm = limiting_func(str, 3);
		lm.forEach(System.out::println);
	}
}
