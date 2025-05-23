package java_06_stream_methods_84;

//Java program to demonstrate
//Stream.takeWhile method
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_18B_Stream_takeWhile_Method {

	public static void main(String[] args) {

		// create a stream of names
		Stream<String> stream = Stream.of("aman", "amar", "suraj", "suvam", "Zahafuj");

		// apply takeWhile to take all the names
		// matches passed predicate
		List<String> list = stream.takeWhile(name -> (name.charAt(0) == 'a')).collect(Collectors.toList());

		// print list
		System.out.println(list);
	}
}
