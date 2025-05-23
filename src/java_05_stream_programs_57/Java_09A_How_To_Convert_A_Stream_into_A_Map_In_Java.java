package java_05_stream_programs_57;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Java_09A_How_To_Convert_A_Stream_into_A_Map_In_Java {

	// Function to convert the string
	// to the map
	public static Map toMap(String input) {
		Map<String, Integer> lengthMap = Arrays.stream(input.split(" "))
				.collect(Collectors.toMap(value -> value, value -> value.length()));

		return lengthMap;
	}

	public static void main(String[] args) {
		String input = "Geeks for Geek";

		System.out.println(toMap(input));
	}
}
