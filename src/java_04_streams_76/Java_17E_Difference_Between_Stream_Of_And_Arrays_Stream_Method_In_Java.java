package java_04_streams_76;

import java.util.stream.Stream;

class Java_17E_Difference_Between_Stream_Of_And_Arrays_Stream_Method_In_Java {

	public static void main(String[] args) {
		// Creating a character array
		char arr[] = { '1', '2', '3', '4', '5' };

		// --------- Using Stream.of() ---------
		// Will work efficiently

		// to convert int array into Stream
		Stream<char[]> stream = Stream.of(arr);

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));
	}
}