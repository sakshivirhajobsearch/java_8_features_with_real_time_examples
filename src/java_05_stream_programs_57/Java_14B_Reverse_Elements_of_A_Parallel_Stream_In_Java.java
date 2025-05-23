package java_05_stream_programs_57;

//Java program to reverse elements
//of a parallel Stream
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Java_14B_Reverse_Elements_of_A_Parallel_Stream_In_Java {

	// Generic function to reverse
	// the elements of the parallel stream
	public static <T> Iterator<T> reverseStream(Stream<T> stream) {
		return stream.collect(Collectors.toCollection(LinkedList::new)).descendingIterator();
	}

	public static void main(String[] args) {

		// Get the parallel stream
		List<Integer> lists = Arrays.asList(11, 22, 33, 44);
		Stream<Integer> stream = lists.parallelStream();

		// Reverse and print the elements
		Iterator<Integer> reverse = reverseStream(stream);
		reverse.forEachRemaining(System.out::println);
	}
}