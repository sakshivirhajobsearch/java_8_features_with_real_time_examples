package java_04_streams_76;

//Java code for converting 
//Stream to Set using Divide 
//and Conquer
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Java_18B_Convert_Stream_To_Set_In_Java {

	// Driver code
	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("G", "E", "K", "S");

		// Converting Stream into an Array
		String[] arr = stream.toArray(String[]::new);

		// Creating a HashSet
		Set<String> set = new HashSet<>();

		// Converting Array to set
		Collections.addAll(set, arr);

		// Displaying the elements
		set.forEach(str -> System.out.println(str));
	}
}
