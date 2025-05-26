package java_08_optional_class_34;

//Java program to demonstrate
//the above method
import java.util.Optional;

public class Java_08B_Optional_hashCode_Method {

	public static void main(String[] args) {

		Optional<Integer> op = Optional.empty();

		System.out.println("Optional: " + op);

		System.out.println("Optional hashCode value: " + op.hashCode());
	}
}
