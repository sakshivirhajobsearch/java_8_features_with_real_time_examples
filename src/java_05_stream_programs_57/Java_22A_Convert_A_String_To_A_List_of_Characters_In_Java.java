package java_05_stream_programs_57;

import java.util.List;
import java.util.stream.Collectors;

public class Java_22A_Convert_A_String_To_A_List_of_Characters_In_Java {

	public static void main(String[] args) {

		// Defining a string
		String s = "Java";

		// Convert String to List of Characters using Streams
		List<Character> ch = s.chars() // Convert String to IntStream (stream of chars)
				.mapToObj(c -> (char) c) // Map each int (char) to Character
				.collect(Collectors.toList()); // Collect into a List

		System.out.println(ch);
	}
}