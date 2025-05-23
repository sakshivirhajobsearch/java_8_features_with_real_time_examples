package java_06_stream_methods_84;

import java.util.Arrays;

public class Java_03E_Stream_foreach_loop_vs_Stream_foreach_vs_Parallel_Stream_foreach {

	public static void main(String[] args) throws Exception {

		String[] arr1 = { "Geeks", "for", "Geeks" };

		// Correct usage: use Arrays.stream() for arrays
		Arrays.stream(arr1).forEach(s -> {
			System.out.print(s);
		});
	}
}
