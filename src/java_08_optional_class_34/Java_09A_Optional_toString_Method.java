package java_08_optional_class_34;

//Java program to demonstrate
//Optional.toString() method
import java.util.Optional;

public class Java_09A_Optional_toString_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.of(452146);

		// get value using toString
		String value = op.toString();

		// print value
		System.out.println("String Representation: " + value);
	}
}