package java_08_optional_class_34;

//Java program to demonstrate
//Optional.orElseThrow() method
import java.util.Optional;

public class Java_15A_Optional_orElseThrow_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.of(9455);

		// print supplier
		System.out.println("Optional: " + op);

		// orElseThrow supplier
		System.out.println("Value by orElseThrow(" + "ArithmeticException::new) method: "
				+ op.orElseThrow(ArithmeticException::new));
	}
}