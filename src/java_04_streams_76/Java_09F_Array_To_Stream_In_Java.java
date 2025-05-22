package java_04_streams_76;

import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class Java_09F_Array_To_Stream_In_Java {

	public static void main(String[] args) { // Converting long array to stream
		long[] arrL = { 3L, 5L, 6L, 8L, 9L };
		LongStream stmL = LongStream.of(arrL);
		stmL.forEach(number -> System.out.print(number + " "));

		System.out.println();

		// Converting double array to stream
		double[] arrD = { 1, 2, 3, 4, 5 };
		DoubleStream stmD = DoubleStream.of(arrD);
		stmD.forEach(d -> System.out.print(d + " "));
	}
}
