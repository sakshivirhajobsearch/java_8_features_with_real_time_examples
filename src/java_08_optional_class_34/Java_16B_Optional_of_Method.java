package java_08_optional_class_34;

//Java program to demonstrate
//Optional.of() method
import java.util.Optional;

public class Java_16B_Optional_of_Method {

	public static void main(String[] args) {

		try {
			// create a Optional
			Optional<Integer> op = Optional.of(null);

			// print value
			System.out.println("Optional: " + op);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
