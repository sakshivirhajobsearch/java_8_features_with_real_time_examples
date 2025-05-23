package java_06_stream_methods_84;

//importing the necessary classes to
//implement the stream interface
import java.util.stream.Stream;

//save as file named GFG2.java
public class Java_19A_concat_Method_of_Stream_Interface_In_Java_API {

	// main method
	public static void main(String[] args) throws Exception {

		// first stream
		Stream<Integer> s1 = Stream.of(1, 2, 3, 4);

		// second stream
		Stream<Integer> s2 = Stream.of(5, 6, 7, 8);

		// concatenation and printing
		// of the stream elements.
		Stream.concat(s1, s2).distinct().forEach(ele -> System.out.println(ele));
	}
}