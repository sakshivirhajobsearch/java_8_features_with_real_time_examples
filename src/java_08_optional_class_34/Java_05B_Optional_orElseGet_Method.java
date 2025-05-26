package java_08_optional_class_34;

//Java program to demonstrate 
//Optional.orElseGet() method 
import java.util.Optional;

public class Java_05B_Optional_orElseGet_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.empty();

		// print supplier
		System.out.println("Optional: " + op);

		try {

			// orElseGet supplier
			System.out.println(
					"Value by orElseGet" + "(Supplier) method: " + op.orElseGet(() -> (int) (Math.random() * 10)));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
