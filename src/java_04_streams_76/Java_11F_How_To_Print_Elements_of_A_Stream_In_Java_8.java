package java_04_streams_76;

//Java code to print the elements of Stream
import java.util.stream.Stream;

public class Java_11F_How_To_Print_Elements_of_A_Stream_In_Java_8 {
	
	public static void main(String[] args) {

		// Get the stream
		Stream<String> stream = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");

		// Print the stream using peek()
		// by providing a terminal operation count()
		stream.peek(s -> System.out.println(s)).count();
	}
}