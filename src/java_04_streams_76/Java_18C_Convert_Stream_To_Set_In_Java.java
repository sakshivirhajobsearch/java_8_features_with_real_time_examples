package java_04_streams_76;

//Java code for converting 
//Stream to Set using forEach
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Java_18C_Convert_Stream_To_Set_In_Java {

	public static void main(String[] args) {

		// Creating a Stream of Integers
		Stream<Integer> stream = Stream.of(5, 10, 15, 20, 25);

		// Creating a HashSet
		Set<Integer> set = new HashSet<>();

		// using set.add() to add elements
		// of stream into empty set
		stream.forEach(set::add);

		// Displaying the elements
		set.forEach(num -> System.out.println(num));
	}
}