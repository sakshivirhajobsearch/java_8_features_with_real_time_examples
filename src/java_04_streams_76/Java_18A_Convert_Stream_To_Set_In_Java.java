package java_04_streams_76;

//Java code for converting 
//Stream to Set using Collectors
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_18A_Convert_Stream_To_Set_In_Java {

	public static void main(String[] args) {

		// Creating a Stream of Integers
		Stream<Integer> stream = Stream.of(-2, -1, 0, 1, 2);

		// Using Stream.collect() to collect the
		// elements of stream in a container.
		Set<Integer> streamSet = stream.collect(Collectors.toSet());

		// Displaying the elements
		streamSet.forEach(num -> System.out.println(num));
	}
}