package java_06_stream_methods_84;

import java.util.ArrayList;
import java.util.List;

public class Java_03G_Stream_foreach_loop_vs_Stream_foreach_vs_Parallel_Stream_foreach {

	public static void main(String[] args) throws Exception {

		List<String> arr1 = new ArrayList<String>();
		arr1.add("Geeks");
		arr1.add("For");
		arr1.add("Geeks");

		arr1.parallelStream().forEach(s -> {
			System.out.print(s);
		});
	}
}
