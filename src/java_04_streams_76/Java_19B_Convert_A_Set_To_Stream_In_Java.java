package java_04_streams_76;

//Java code for converting 
//Set to Stream
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Java_19B_Convert_A_Set_To_Stream_In_Java {

	public static void main(String[] args) {

		// Creating an String HashSet
		Set<String> set = new HashSet<>();

		// adding elements in set
		set.add("Geeks");
		set.add("for");
		set.add("GeeksQuiz");
		set.add("GeeksforGeeks");

		// converting Set to Stream
		Stream<String> stream = set.stream();

		// displaying elements of Stream
		stream.forEach(elem -> System.out.print(elem + " "));

	}
}