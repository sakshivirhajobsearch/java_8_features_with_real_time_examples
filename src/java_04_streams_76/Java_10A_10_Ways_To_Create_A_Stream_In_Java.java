package java_04_streams_76;

//Java program to create Stream from Collections
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Java_10A_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static <T> void getStream(List<T> list) {

		// Create stream object with the List
		Stream<T> stream = list.stream();

		// Iterate list first to last element
		Iterator<T> it = stream.iterator();

		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void main(String[] args) {

		// Create ArrayList of String
		List<String> list = new ArrayList<>();

		// Add element in list
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");

		// Get the Stream from the List
		getStream(list);
	}
}