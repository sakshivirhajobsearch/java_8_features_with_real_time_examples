package java_05_stream_programs_57;

//Java program to reverse elements
//of a parallel Stream
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

class Java_15A_How_To_Get_ArrayList_From_Stream_In_Java_8 {

	// Generic function to reverse
	// the elements of the parallel stream
	public static <T> Stream<T> reverseStream(Stream<T> stream) {
		return stream.collect(Collector.of(() -> new ArrayDeque<T>(), ArrayDeque::addFirst, (a, b) -> {
			b.addAll(a);
			return b;
		})).stream();
	}

	// Driver code
	public static void main(String[] args) {

		// Get the parallel stream
		List<Integer> lists = Arrays.asList(11, 22, 33, 44);
		Stream<Integer> stream = lists.parallelStream();

		// Reverse and print the elements
		reverseStream(stream).forEach(System.out::println);
	}
}