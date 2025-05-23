package java_05_stream_programs_57;

//Java Program to convert
//Map<Key, Value> into Stream
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Java_01A_Program_To_Convert_A_Map_To_A_Stream_In_Java {

	// Generic function to convert List of
	// String to List of Integer
	public static <K, V> Stream<Map.Entry<K, V>> convertMapToStream(Map<K, V> map) {

		// Return the obtained Stream
		return map

				// Convert the Map to Set
				.entrySet()

				// Convert the Set to Stream
				.stream();
	}

	public static void main(String args[]) {

		// Create a Map
		Map<Integer, String> map = new HashMap<>();

		// Add entries to the Map
		map.put(1, "Geeks");
		map.put(2, "forGeeks");
		map.put(3, "A computer Portal");

		// Print the Map
		System.out.println("Map: " + map);

		// Convert the Map to Stream
		Stream<Map.Entry<Integer, String>> stream = convertMapToStream(map);

		// Print the TreeMap
		System.out.println("Stream: " + Arrays.toString(stream.toArray()));
	}
}
