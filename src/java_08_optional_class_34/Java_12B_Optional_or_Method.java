package java_08_optional_class_34;

//Java program to demonstrate
//Optional.or() method
import java.util.Optional;

public class Java_12B_Optional_or_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.empty();

		// print supplier
		System.out.println("Optional: " + op);

		try {

			// or supplier
			System.out.println("Optional by or(() ->" + " Optional.of(100)) method: " + op.or(() -> Optional.of(100)));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
