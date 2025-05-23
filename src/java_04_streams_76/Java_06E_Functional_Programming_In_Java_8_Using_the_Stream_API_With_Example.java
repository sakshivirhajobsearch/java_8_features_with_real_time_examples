package java_04_streams_76;

import java.util.ArrayList;

//Class
public class Java_06E_Functional_Programming_In_Java_8_Using_the_Stream_API_With_Example {

	public static void main(String[] args) {
		// Creating an ArrayList of Integer type
		ArrayList<Integer> list = new ArrayList<>();

		// Adding elements to above object of Arraylist
		// Custom inputs
		list.add(20);
		list.add(4);
		list.add(76);
		list.add(21);
		list.add(3);
		list.add(80);

		var stream = list.stream();

		var numbers = stream.filter(number -> number % 2 == 0).filter(number -> number > 20);

		// Print all the elements of the stream on the console
		numbers.forEach(System.out::println);
	}
}
