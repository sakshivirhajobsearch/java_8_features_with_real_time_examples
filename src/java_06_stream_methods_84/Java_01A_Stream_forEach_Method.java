package java_06_stream_methods_84;

//Java code for forEach
//(Consumer action) in Java 8
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java_01A_Stream_forEach_Method {

	public static void main(String[] args) {

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		// Using forEach(Consumer action) to
		// print the elements of stream
		// in reverse order
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
