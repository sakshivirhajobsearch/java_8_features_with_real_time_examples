package java_06_stream_methods_84;

//Java code for Stream anyMatch
//(Predicate predicate) to check whether 
//any element of this stream match 
//the provided predicate.
import java.util.Arrays;
import java.util.List;

public class Java_06A_Stream_anyMatch {

	public static void main(String[] args) {

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

		// Stream anyMatch(Predicate predicate)
		boolean answer = list.stream().anyMatch(n -> (n * (n + 1)) / 4 == 5);

		// Displaying the result
		System.out.println(answer);
	}
}
