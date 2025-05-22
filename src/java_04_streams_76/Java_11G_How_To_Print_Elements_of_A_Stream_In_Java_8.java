package java_04_streams_76;

//Java code to print the elements of Stream
import java.util.stream.Stream;

public class Java_11G_How_To_Print_Elements_of_A_Stream_In_Java_8 {
	
	public static void main(String[] args) {

		// Get the stream
		Stream<String> stream = Stream.of("Geeks", "For", "GeeksForGeeks", "A", "Computer", "Portal");

		// Since the stream is not being consumed
		// this will not throw any exception

		// Print the stream
		stream.filter(s -> s.startsWith("G")).peek(s -> System.out.println("Filtered value: " + s))
				.map(String::toUpperCase).peek(s -> System.out.println("Uppercase value :" + s)).count();
	}
}