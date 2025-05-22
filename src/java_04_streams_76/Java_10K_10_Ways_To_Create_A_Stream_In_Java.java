package java_04_streams_76;

//Java program to create Stream from Collections
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Java_10K_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static <T> void getStream(Iterable<T> iterable) {

		// Convert the iterator into a Stream
		Stream<T> stream = StreamSupport.stream(iterable.spliterator(), false);

		// Iterate list first to last element
		Iterator<T> it = stream.iterator();

		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void main(String[] args) {

		// Get the Iterable
		Iterable<String> iterable = Arrays.asList("a", "b", "c");

		// Get the Stream from the Iterable
		getStream(iterable);
	}
}
