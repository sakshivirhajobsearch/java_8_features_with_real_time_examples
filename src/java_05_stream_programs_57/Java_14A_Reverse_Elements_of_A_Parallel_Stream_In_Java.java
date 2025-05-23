package java_05_stream_programs_57;

//Java program to reverse elements
//of a parallel Stream
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_14A_Reverse_Elements_of_A_Parallel_Stream_In_Java {

	// Generic function to reverse
	// the elements of the parallel stream
	public static <T> Collector<T, ?, Stream<T>> reverseStream() {
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list.stream();
		});
	}

	public static void main(String[] args) {

		// Get the parallel stream
		List<Integer> lists = Arrays.asList(11, 22, 33, 44);
		Stream<Integer> stream = lists.parallelStream();

		// Reverse and print the elements
		stream.collect(reverseStream()).forEach(System.out::println);
	}
}
