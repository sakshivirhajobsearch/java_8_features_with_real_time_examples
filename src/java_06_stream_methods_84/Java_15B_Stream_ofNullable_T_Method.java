package java_06_stream_methods_84;

//Java program to demonstrate
//Stream.ofNullable method

import java.util.ArrayList;
import java.util.stream.Stream;

public class Java_15B_Stream_ofNullable_T_Method {

	public static void main(String[] args) {

		// Create ArrayList containing names
		ArrayList<String> list = new ArrayList<String>();
		list.add("Aman");
		list.add("Suraj");
		list.add("Zufaq");

		// create a stream with ArrayList
		Stream<ArrayList<String>> value = Stream.ofNullable(list);

		// print values
		System.out.println("Values of Stream:");
		value.forEach(System.out::println);
	}
}
