package java_08_optional_class_34;

//Java program to demonstrate
//Optional.orElseThrow() method
import java.util.Optional;

public class Java_15B_Optional_orElseThrow_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.empty();

		// print supplier
		System.out.println("Optional: " + op);

		try {

			// orElseThrow supplier
			System.out.println("Value by orElseThrow(" + "ArithmeticException::new) method: "
					+ op.orElseThrow(ArithmeticException::new));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
