package java_08_optional_class_34;

//Java program to demonstrate
//Optional.ofNullable() method
import java.util.Optional;

public class Java_02B_Optional_ofNullable_Method {

	public static void main(String[] args) {
		// create a Optional
		Optional<String> op2 = Optional.ofNullable(null);

		// print value
		System.out.println("Optional 2: " + op2);
	}
}