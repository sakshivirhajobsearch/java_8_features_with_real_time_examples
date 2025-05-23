package java_05_stream_programs_57;

//Java Program to convert
//List to Stream in Java 8
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java_05B_Program_To_Convert_List_To_Stream_In_Java {

	public static void main(String args[]) {

		// Create a stream of integers
		List<String> list = Arrays.asList("GeeksForGeeks", "A computer portal", "for", "Geeks");

		// Print the List
		System.out.println("List: " + list);

		// Create the predicate for item starting with G
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				// filter items that start with "G"
				return s.startsWith("G");
			}
		};

		System.out.println("Stream from List with items" + " starting with G: ");

		// Convert List to stream
		list.stream().filter(predicate).forEach(System.out::println);
	}
}