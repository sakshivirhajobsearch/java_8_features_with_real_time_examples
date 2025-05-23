package java_06_stream_methods_84;

public class Java_03C_Stream_foreach_loop_vs_Stream_foreach_vs_Parallel_Stream_foreach {

	public static String frechlop(String[] geek) {
		
		int count = 0;
		for (String var : geek) {
			if (count == 1)
				return var;
			count++;
		}
		return "";
	}

	public static void main(String[] args) throws Exception {

		String[] arr1 = { "Geeks", "For", "Geeks" };
		String secelt = frechlop(arr1);
		System.out.println(secelt);
	}
}
