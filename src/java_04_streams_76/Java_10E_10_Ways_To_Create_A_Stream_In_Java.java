package java_04_streams_76;

//Java program to create empty Stream
import java.util.Iterator;
import java.util.stream.Stream;

public class Java_10E_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static void getStream() {

		// Create stream from an array using Stream.empty()
		Stream<String> streamOfArray = Stream.empty();

		// Iterate list first to last element
		Iterator<String> it = streamOfArray.iterator();

		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void main(String[] args) {

		// Get the empty Stream
		getStream();
	}
}
