package java_02_functional_interfaces_28;

//Java program to illustrate 
//passing Predicate into function

import java.util.function.Predicate;

class Java_04C_Predicate_Interface_Approach_3 {
	
	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}

	public static void main(String[] args) {
		pred(10, (i) -> i > 7);
	}
}