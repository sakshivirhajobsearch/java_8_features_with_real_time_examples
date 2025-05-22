package java_04_streams_76;

import java.util.Arrays;
import java.util.List;

public class Java_05A_Parallel_vs_Sequential_Stream_In_Java {

	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

		// we are using stream() method
		// for sequential stream
		// Iterate and print each element
		// of the stream
		list.stream().forEach(System.out::print);
	}
}