package java_04_streams_76;

//Java code to print the elements of Stream
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_11D_How_To_Print_Elements_of_A_Stream_In_Java_8 {
	
	public static void main(String[] args) {

		// Get the stream
		Stream<String> stream = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");

		// Print the stream
		System.out.println(stream.collect(Collectors.toList()));
	}
}