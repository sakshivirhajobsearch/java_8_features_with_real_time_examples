package java_04_streams_76;

//Java code for converting string array
//to stream using Arrays.stream()
import java.util.Arrays;
import java.util.stream.Stream;

public class Java_09A_Array_To_Stream_In_Java {

	public static void main(String[] args) {
		// Converting String array to stream
		String[] arr = { "Geeks", "for", "Geeks" };

		// Using Arrays.stream to convert an
		// array into Stream
		Stream<String> stm = Arrays.stream(arr);

		// Displaying elements in Stream
		stm.forEach(str -> System.out.print(str + " "));
	}
}