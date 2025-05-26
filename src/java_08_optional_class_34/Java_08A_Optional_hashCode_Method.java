package java_08_optional_class_34;

//Java program to demonstrate
//the above method
import java.util.Optional;

public class Java_08A_Optional_hashCode_Method {

	public static void main(String[] args) {

		Optional<Integer> op = Optional.of(456);

		System.out.println("Optional: " + op);

		System.out.println("Optional hashCode value: " + op.hashCode());
	}
}