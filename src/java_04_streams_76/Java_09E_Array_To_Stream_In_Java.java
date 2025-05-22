package java_04_streams_76;

import java.util.stream.IntStream;

public class Java_09E_Array_To_Stream_In_Java {

	public static void main(String[] args) {
		// Converting int array to stream
		int arr[] = { 1, 2, 3, 4, 5 };

		IntStream stm = IntStream.of(arr);

		stm.forEach(a -> System.out.print(a + " "));
	}
}
