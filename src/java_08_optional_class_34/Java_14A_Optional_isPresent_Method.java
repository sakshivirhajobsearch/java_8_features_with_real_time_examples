package java_08_optional_class_34;

//Java program to demonstrate Optional.isPresent() 
//with a non-empty Optional
import java.util.Optional;

public class Java_14A_Optional_isPresent_Method {

	public static void main(String[] args) {

		// Create an Optional with a non-null value
		Optional<Integer> optional = Optional.of(9455);

		// Print the Optional value
		System.out.println("Optional: " + optional);

		// Check if a value is present
		System.out.println("Is any value present: " + optional.isPresent());
	}
}
