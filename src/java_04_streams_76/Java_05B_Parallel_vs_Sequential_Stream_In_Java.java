package java_04_streams_76;

import java.util.Arrays;
import java.util.List;

public class Java_05B_Parallel_vs_Sequential_Stream_In_Java {
	
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

		// using parallelStream()
		// method for parallel stream
		list.parallelStream().forEach(System.out::print);
	}
}
