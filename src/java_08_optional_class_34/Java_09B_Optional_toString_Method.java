package java_08_optional_class_34;

//Java program to demonstrate
//Optional.toString() method

import java.util.Optional;

public class Java_09B_Optional_toString_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.empty();

		// get value using toString
		String value = op.toString();

		// print value
		System.out.println("String Representation: " + value);
	}
}
