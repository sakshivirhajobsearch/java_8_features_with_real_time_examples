package java_04_streams_76;

//Java program to create Stream from Collections
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Java_10C_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static <T> void getStream(T[] arr) {

		// Create stream from an array
		// using Arrays.stream()
		Stream<T> streamOfArray = Arrays.stream(arr);

		// Iterate list first to last element
		Iterator<T> it = streamOfArray.iterator();

		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void main(String[] args) {

		// Get the array
		String[] arr = new String[] { "a", "b", "c" };

		// Get the Stream from the Array
		getStream(arr);
	}
}