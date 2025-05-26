package java_08_optional_class_34;

//Java program to demonstrate
//Optional.filter() method
import java.util.Optional;

public class Java_06A_Optional_filter_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.of(9456);

		// print value
		System.out.println("Optional: " + op);

		// filter the value
		System.out.println("Filtered value " + "for odd or even: " + op.filter(num -> num % 2 == 0));
	}
}