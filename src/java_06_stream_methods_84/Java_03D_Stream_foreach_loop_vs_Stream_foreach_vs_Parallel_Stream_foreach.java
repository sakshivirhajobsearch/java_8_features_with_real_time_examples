package java_06_stream_methods_84;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Java_03D_Stream_foreach_loop_vs_Stream_foreach_vs_Parallel_Stream_foreach {

	public static void main(String[] args) throws Exception {

		List<String> arr1 = new ArrayList<String>();
		AtomicInteger count = new AtomicInteger(0);

		arr1.add("Geeks");
		arr1.add("For");
		arr1.add("Geeks");

		arr1.stream().forEach(s -> {
			// increment count
			count.getAndIncrement();

			// print all elements
			System.out.print(s);
		});

		// print final count
		System.out.println("\nCount: " + count.get());
	}
}
