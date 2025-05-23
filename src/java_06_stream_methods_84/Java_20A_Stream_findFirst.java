package java_06_stream_methods_84;

//Java code for Stream findFirst()
//which returns an Optional describing
//the first element of this stream, or
//an empty Optional if the stream is empty.
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java_20A_Stream_findFirst {

	public static void main(String[] args) {

		// Creating a List of Integers
		List<Integer> list = Arrays.asList(3, 5, 7, 9, 11);

		// Using Stream findFirst()
		Optional<Integer> answer = list.stream().findFirst();

		// if the stream is empty, an empty
		// Optional is returned.
		if (answer.isPresent()) {
			System.out.println(answer.get());
		} else {
			System.out.println("no value");
		}
	}
}
