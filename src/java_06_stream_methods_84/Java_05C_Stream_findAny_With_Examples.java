package java_06_stream_methods_84;

//Java code for Stream findAny()
//which returns an Optional describing
//some element of the stream, or an
//empty Optional if the stream is empty.
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Java_05C_Stream_findAny_With_Examples {
	
	public static void main(String[] args) {

		// Creating an IntStream
		IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16).parallel();

		// Using Stream findAny().
		// Executing the source code multiple times
		// may not return the same result.
		// Every time you may get a different
		// Integer which is divisible by 4.
		stream = stream.filter(i -> i % 4 == 0);

		OptionalInt answer = stream.findAny();
		if (answer.isPresent()) {
			System.out.println(answer.getAsInt());
		}
	}
}