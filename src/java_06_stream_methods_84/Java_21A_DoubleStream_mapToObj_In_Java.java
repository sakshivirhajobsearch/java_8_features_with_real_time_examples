package java_06_stream_methods_84;

import java.util.stream.DoubleStream;

public class Java_21A_DoubleStream_mapToObj_In_Java {

	public static void main(String[] args) {
		
		// Creating a DoubleStream
		DoubleStream stream = DoubleStream.of(3.4, 4.5, 6.7, 8.9);

		// Using DoubleStream mapToObj(DoubleFunction mapper)
		// and displaying an object-valued Stream
		// consisting of the results of
		// applying the given function
		stream.mapToObj(num -> {
			return num * num * num;
		}).forEach(System.out::println);

	}
}
