package java_04_streams_76;

//Java program to create Stream from Collections
import java.util.Iterator;
import java.util.stream.Stream;

public class Java_10F_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static <T> void getStream() {

		// Create stream using Stream builder()
		Stream.Builder<String> builder = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> stream = builder.add("a").add("b").add("c").build();

		// Iterate list first to last element
		Iterator<String> it = stream.iterator();

		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void main(String[] args) {

		// Get the Stream using Builder
		getStream();
	}
}