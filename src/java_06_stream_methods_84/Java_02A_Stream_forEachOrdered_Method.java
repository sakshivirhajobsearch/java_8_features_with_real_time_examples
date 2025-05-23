package java_06_stream_methods_84;

//Java code for forEachOrdered
//(Consumer action) in Java 8
import java.util.Arrays;
import java.util.List;

public class Java_02A_Stream_forEachOrdered_Method {

	public static void main(String[] args) {

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(10, 19, 20, 1, 2);

		// Using forEachOrdered(Consumer action) to
		// print the elements of stream in encounter order
		list.stream().forEachOrdered(System.out::println);

	}
}