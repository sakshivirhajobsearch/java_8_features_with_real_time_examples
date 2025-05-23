package java_06_stream_methods_84;

import java.math.BigDecimal;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Java_21B_DoubleStream_mapToObj_In_Java {

	public static void main(String[] args) {
		
		// Creating a DoubleStream
		DoubleStream stream = DoubleStream.of(3.4, 4.5, 6.7, 8.9);

		// Creating a Stream
		// Using DoubleStream mapToObj(DoubleFunction mapper)
		Stream<BigDecimal> stream1 = stream.mapToObj(BigDecimal::valueOf);

		// Displaying an object-valued Stream
		// consisting of the results of
		// applying the given function.
		stream1.forEach(num -> System.out.println(num.add(BigDecimal.TEN)));
	}
}
