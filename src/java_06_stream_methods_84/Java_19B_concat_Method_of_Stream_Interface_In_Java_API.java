package java_06_stream_methods_84;

import java.util.stream.DoubleStream;

//save as file named GFG2.java
public class Java_19B_concat_Method_of_Stream_Interface_In_Java_API {

	// main method
	public static void main(String[] args) throws Exception {

		// first stream
		DoubleStream s1 = DoubleStream.of(1.025, 2.0687, 3.01);

		// second stream
		DoubleStream s2 = DoubleStream.of(5.2587410, 8);

		// concatenation and printing
		// of the stream elements.
		DoubleStream.concat(s1, s2).distinct().forEach(ele -> System.out.println(ele));
	}
}
