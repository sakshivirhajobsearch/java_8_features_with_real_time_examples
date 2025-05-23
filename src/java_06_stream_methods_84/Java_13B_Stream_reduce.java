package java_06_stream_methods_84;

//Implementation of reduce method
//to get the combined String
import java.util.Arrays;
import java.util.Optional;

public class Java_13B_Stream_reduce {
	
	public static void main(String[] args) {
		
		// String array to combine
		String[] array = { "Geeks", "for", "Geeks" };

		// Using reduce to concatenate strings with a hyphen
		Optional<String> combinedString = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);

		// Displaying the combined String
		combinedString.ifPresent(System.out::println);
	}
}
