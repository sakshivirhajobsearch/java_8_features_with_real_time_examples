package java_05_stream_programs_57;

//Java program to flatten a stream of map
//using forEach() method
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java_21B_Flatten_A_Stream_of_Map_In_Java_Using_forEach_loop {

	// Function to flatten a Stream of Map
	public static <T> List<T> flattenStream(Collection<List<T>> lists) {

		// Create an empty list to collect the stream
		List<T> finalList = new ArrayList<>();

		// Using forEach loop
		// convert each list into stream
		// and add the stream into list
		for (List<T> list : lists) {
			list.stream().forEach(finalList::add);
		}

		// Return the final flattened list
		return finalList;
	}

	public static void main(String[] args) {

		// Get the map to be flattened.
		Map<Integer, List<Character>> map = new HashMap<>();
		map.put(1, Arrays.asList('G', 'e', 'e', 'k', 's'));
		map.put(2, Arrays.asList('F', 'o', 'r'));
		map.put(3, Arrays.asList('G', 'e', 'e', 'k', 's'));

		// Flatten the Stream
		List<Character> flatList = flattenStream(map.values());

		// Print the flattened list
		System.out.println(flatList);
	}
}
