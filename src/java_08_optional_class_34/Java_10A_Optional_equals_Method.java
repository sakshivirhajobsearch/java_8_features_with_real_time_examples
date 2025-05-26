package java_08_optional_class_34;

import java.util.Optional;

public class Java_10A_Optional_equals_Method {

	public static void main(String[] args) {

		Optional<Integer> op1 = Optional.of(456);

		System.out.println("Optional 1: " + op1);

		Optional<Integer> op2 = Optional.of(456);

		System.out.println("Optional 2: " + op2);

		System.out.println("Comparing Optional 1" + " and Optional 2: " + op1.equals(op2));
	}
}
