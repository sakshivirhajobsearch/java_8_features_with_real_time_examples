package java_06_stream_methods_84;

//Java code for Stream findAny()
//which returns an Optional describing
//some element of the stream, or an
//empty Optional if the stream is empty.
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java_05A_Stream_findAny_With_Examples {
	
	public static void main(String[] args) {
		
		// Creating a List of Integers
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		// Using Stream findAny() to return
		// an Optional describing some element
		// of the stream
		Optional<Integer> answer = list.stream().findAny();

		// if the stream is empty, an empty
		// Optional is returned.
		if (answer.isPresent()) {
			System.out.println(answer.get());
		} else {
			System.out.println("no value");
		}
	}
}
