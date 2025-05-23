package java_06_stream_methods_84;

//Java code for Stream builder()
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_22C_Stream_Builder_accept_Method_In_Java {

	public static void main(String[] args) {
		
		// Using Stream builder()
		Stream.Builder<String> builder = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> stream = builder.add("GEEKS").add("for").add("Geeks").add("GeEKSQuiz").build();

		// Converting elements to Lower Case
		// and storing them in List list
		List<String> list = stream.map(String::toLowerCase).collect(Collectors.toList());

		// Displaying the elements in list
		System.out.println(list);
	}
}