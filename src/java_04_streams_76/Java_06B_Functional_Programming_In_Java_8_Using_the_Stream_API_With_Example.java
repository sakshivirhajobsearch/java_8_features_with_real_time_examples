package java_04_streams_76;

//Importing class for additional operations,
//additionls and pipelines
import java.util.stream.IntStream;

//Class
public class Java_06B_Functional_Programming_In_Java_8_Using_the_Stream_API_With_Example {

	public static void main(String[] args) {
		
		// Creating a predefined stream using range method
		// Custom inputs for range as parameters
		var stream = IntStream.range(1, 100);

		// Stream is created
		var max = stream.filter(number -> number % 4 == 0).count();

		// Print and display the maximum number
		// from the stream
		System.out.println(max);
	}
}