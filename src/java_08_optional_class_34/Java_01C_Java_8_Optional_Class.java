package java_08_optional_class_34;

//Java program to illustrate
//optional class methods

import java.util.Optional;

public class Java_01C_Java_8_Optional_Class {

	// Driver code
	public static void main(String[] args) {

		// creating a string array
		String[] str = new String[5];

		// Setting value for 2nd index
		str[2] = "Geeks Classes are coming soon";

		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
	}
}
