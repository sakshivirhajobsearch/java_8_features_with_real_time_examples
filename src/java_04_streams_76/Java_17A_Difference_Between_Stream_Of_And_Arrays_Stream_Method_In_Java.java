package java_04_streams_76;

//Java program to demonstrate Arrays.stream() method
import java.util.Arrays;
import java.util.stream.Stream;

public class Java_17A_Difference_Between_Stream_Of_And_Arrays_Stream_Method_In_Java {
	
	public static void main(String[] args) {

		// Creating a String array
		String[] arr = { "Geeks", "for", "Geeks" };

		// Using Arrays.stream() to convert
		// array into Stream
		Stream<String> stream = Arrays.stream(arr);

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));
	}
}