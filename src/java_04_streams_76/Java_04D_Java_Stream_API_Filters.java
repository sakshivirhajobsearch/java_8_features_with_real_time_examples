package java_04_streams_76;

import java.util.stream.IntStream;

public class Java_04D_Java_Stream_API_Filters {

	public static void filterByIndexUsingStream() {
		
		// create an array of Strings
		String[] myArray = new String[] { "stream", "is", "a", "sequence", "of", "elements", "like", "list" };

		// create instream on range of integers
		// filter by even integer and map
		// the integer to the Object of myArray
		IntStream.rangeClosed(0, myArray.length - 1).filter(x -> x % 2 == 0).mapToObj(x -> myArray[x])
				.forEach(System.out::println);
	}

	public static void main(String[] args) {
		filterByIndexUsingStream();
	}
}