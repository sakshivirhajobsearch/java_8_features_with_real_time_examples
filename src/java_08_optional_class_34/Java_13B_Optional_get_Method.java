package java_08_optional_class_34;

//Java program to demonstrate
//Optional.get() method
import java.util.Optional;

public class Java_13B_Optional_get_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.empty();

		// print value
		System.out.println("Optional: " + op);

		try {

			// get the value
			System.out.println("Value of " + "this Optional: " + op.get());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
