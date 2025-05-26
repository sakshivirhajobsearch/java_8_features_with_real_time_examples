package java_08_optional_class_34;

//Java program to demonstrate
//Optional.get() method
import java.util.Optional;

public class Java_13A_Optional_get_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.of(9455);

		// print value
		System.out.println("Optional: " + op);

		// get the value
		System.out.println("Value of this Optional: " + op.get());
	}
}