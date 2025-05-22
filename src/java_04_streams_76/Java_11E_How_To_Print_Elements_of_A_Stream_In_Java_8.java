package java_04_streams_76;

//Java code to print the elements of Stream
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_11E_How_To_Print_Elements_of_A_Stream_In_Java_8 {
	
	public static void main(String[] args) {

		// Get the stream
		Stream<String> stream = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");

		// Print the stream
		System.out.println(stream.collect(Collectors.toList()));

		// Since the stream has been already consumed
		// this will throw exception
		try {

			// Print the stream
			System.out.println(stream.collect(Collectors.toList()));
		}

		catch (Exception e) {

			System.out.println("\nException: " + e);
		}
	}
}
