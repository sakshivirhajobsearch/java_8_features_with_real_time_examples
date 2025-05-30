package java_05_stream_programs_57;

//Java program to find the duplicate
//elements in a Stream using Collectors.groupingBy()
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_12B_How_To_Find_Duplicate_Elements_In_A_Stream_In_Java {

	// Function to find the
	// duplicates in a Stream
	public static <T> Set<T> findDuplicateInStream(Stream<T> stream) {

		// Return the set of duplicate elements
		return stream

				// Group the elements along
				// with their frequency in a map
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

				// Convert this map into a stream
				.entrySet().stream()

				// Check if frequency > 1
				// for duplicate elements
				.filter(m -> m.getValue() > 1)

				// Find such elements
				.map(Map.Entry::getKey)

				// And Collect them in a Set
				.collect(Collectors.toSet());
	}

	public static void main(String[] args) {

		// Initial stream
		Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

		// Print the found duplicate elements
		System.out.println(findDuplicateInStream(stream));
	}
}
