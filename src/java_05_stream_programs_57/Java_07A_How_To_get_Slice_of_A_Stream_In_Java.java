package java_05_stream_programs_57;

//Java program to get slice of a stream using
//Stream skip() and limit()
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Java_07A_How_To_get_Slice_of_A_Stream_In_Java {

	// Generic function to get Slice of a
	// Stream from startIndex to endIndex
	public static <T> Stream<T> getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) {
		return stream
				// specify the number of elements to skip
				.skip(startIndex)

				// specify the no. of elements the stream
				// that should be limited
				.limit(endIndex - startIndex + 1);
	}

	public static void main(String[] args) {

		// Create a new List with values 11 - 20
		List<Integer> list = new ArrayList<>();
		for (int i = 11; i <= 20; i++)
			list.add(i);

		// Create stream from list
		Stream<Integer> intStream = list.stream();

		// Print the stream
		System.out.println("List: " + list);

		// Get Slice of Stream
		// containing of elements from the 4th index to 8th
		Stream<Integer> sliceOfIntStream = getSliceOfStream(intStream, 4, 8);

		// Print the slice
		System.out.println("\nSlice of Stream:");
		sliceOfIntStream.forEach(System.out::println);
	}
}
