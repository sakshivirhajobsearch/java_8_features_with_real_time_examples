package java_08_optional_class_34;

//Java program to demonstrate 
//Optional.orElseGet() method 
import java.util.Optional;

public class Java_05A_Optional_orElseGet_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.of(9455);

		// print supplier
		System.out.println("Optional: " + op);

		// orElseGet supplier
		System.out
				.println("Value by orElseGet" + "(Supplier) method: " + op.orElseGet(() -> (int) (Math.random() * 10)));
	}
}
