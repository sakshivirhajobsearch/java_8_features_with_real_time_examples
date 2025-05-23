package java_03_method_reference_6;

//Using Method Reference
import java.util.Arrays;

public class Java_01A_method_references {

	// Method
	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		String[] names = { "Geek1", "Geek2", "Geek3" };

		// Using method reference to print each name
		Arrays.stream(names).forEach(Java_01A_method_references::print);
	}
}