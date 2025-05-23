package java_05_stream_programs_57;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_23A_Initialize_A_List_In_A_Single_Line_With_A_Specified_Value_Using_Java_Stream {

	// Function to create a List
	// with the specified value
	public static <T> List<T> createList(T N) {

		// Currently only one value is taken
		int size = 1;

		return Stream

				// Generate the Stream
				.generate(String::new)

				// Size of the List to be created
				.limit(size)

				// Passing the value to be mapped
				.map(s -> N)

				// Convert the generated stream into List
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		int N = 1024;
		System.out.println("List with element " + N + ": " + createList(N));

		String str = "GeeksForGeeks";
		System.out.println("List with element " + str + ": " + createList(str));
	}
}
