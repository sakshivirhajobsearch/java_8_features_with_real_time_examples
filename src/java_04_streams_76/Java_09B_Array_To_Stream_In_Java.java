package java_04_streams_76;

//Java code for converting string array
//to stream using Arrays.stream()
import java.util.Arrays;
import java.util.stream.IntStream;

public class Java_09B_Array_To_Stream_In_Java {

	public static void main(String[] args) {
		// Converting int array to stream
		int arr[] = { 1, 2, 3, 4, 5 };

		IntStream stm = Arrays.stream(arr);

		stm.forEach(a -> System.out.print(a + " "));
	}
}
