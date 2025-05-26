package java_02_functional_interfaces_28;

//Java program to illustrate Simple Predicate

import java.util.function.Predicate;

public class Java_04A_Predicate_Interface_Approach_1 {
	
	public static void main(String[] args) {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
	}
}
