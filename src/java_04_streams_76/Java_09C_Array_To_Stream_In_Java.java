package java_04_streams_76;

//Java code for converting string array
//to stream using Arrays.stream()
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class Java_09C_Array_To_Stream_In_Java {

	public static void main(String[] args) { // Converting long array to stream
		long[] arrL = { 3L, 5L, 6L, 8L, 9L };
		LongStream stmL = Arrays.stream(arrL);
		stmL.forEach(number -> System.out.print(number + " "));

		System.out.println();

		// Converting double array to stream
		double[] arrD = { 1, 2, 3, 4, 5 };
		DoubleStream stmD = Arrays.stream(arrD);
		stmD.forEach(d -> System.out.print(d + " "));
	}
}
