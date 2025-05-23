package java_06_stream_methods_84;

public class Java_03A_Stream_foreach_loop_vs_Stream_foreach_vs_Parallel_Stream_foreach {

	public static void main(String[] args) {
		
		String[] arr = { "1", "2", "3" };
		int count = 0;

		String[] arr1 = { "Geeks", "For", "Geeks" };

		for (String str : arr) {
			System.out.print(arr1[count++]);
		}
	}
}
