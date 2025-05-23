package java_06_stream_methods_84;

//Java program to demonstrate
//Stream.takeWhile method

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_18A_Stream_takeWhile_Method {

	public static void main(String[] args) {

		// create a stream of numbers from 1 to 10
		Stream<Integer> stream = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

		// apply takeWhile to take all the numbers
		// matches passed predicate
		List<Integer> list = stream.takeWhile(number -> (number / 4 == 1)).collect(Collectors.toList());

		// print list
		System.out.println(list);
	}
}