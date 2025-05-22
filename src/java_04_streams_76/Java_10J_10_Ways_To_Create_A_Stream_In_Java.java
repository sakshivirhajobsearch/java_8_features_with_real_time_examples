package java_04_streams_76;

//Java program to create Stream from Collections
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Java_10J_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static <T> void getStream(Iterator<T> itr) {

		// Convert the iterator into a Spliterator
		Spliterator<T> spitr = Spliterators.spliteratorUnknownSize(itr, Spliterator.NONNULL);

		// Convert spliterator into a sequential stream
		Stream<T> stream = StreamSupport.stream(spitr, false);

		// Iterate list first to last element
		Iterator<T> it = stream.iterator();

		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void main(String[] args) {

		// Get the Iterator
		Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();

		// Get the Stream from the Iterator
		getStream(iterator);
	}
}
