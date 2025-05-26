package java_08_optional_class_34;

//Java program to demonstrate
//Optional.ofNullable() method
import java.util.Optional;

public class Java_02A_Optional_ofNullable_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op1 = Optional.ofNullable(9455);

		// print value
		System.out.println("Optional 1: " + op1);
	}
}