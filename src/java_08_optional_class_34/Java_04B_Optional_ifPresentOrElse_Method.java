package java_08_optional_class_34;

//Java program to demonstrate
//Optional.ifPresentOrElse method
import java.util.Optional;

public class Java_04B_Optional_ifPresentOrElse_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.empty();

		// print value
		System.out.println("Optional: " + op);

		try {

			// apply ifPresentOrElse
			op.ifPresentOrElse((value) -> {
				System.out.println("Value is present, its: " + value);
			}, () -> {
				System.out.println("Value is empty");
			});
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}