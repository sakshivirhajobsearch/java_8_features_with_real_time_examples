package java_06_stream_methods_84;

//Java code for Stream allMatch
//(Predicate predicate) to check whether 
//all elements of this stream match 
//the provided predicate.
import java.util.Arrays;
import java.util.List;

public class Java_07A_Stream_allMatch {

	public static void main(String[] args) {

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

		// Check if all elements of stream
		// are divisible by 3 or not using
		// Stream allMatch(Predicate predicate)
		boolean answer = list.stream().allMatch(n -> n % 3 == 0);

		// Displaying the result
		System.out.println(answer);
	}
}