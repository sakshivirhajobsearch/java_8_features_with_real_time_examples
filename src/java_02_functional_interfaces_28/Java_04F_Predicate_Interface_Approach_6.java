package java_02_functional_interfaces_28;

//Java program to illustrate 
//negate Predicate

import java.util.function.Predicate;

public class Java_04F_Predicate_Interface_Approach_6 {
	
	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		
		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	};

	public static void predicate_negate() {

		String lengthGTThan10 = "Thunderstruck is a 2012 children's " + "film starring Kevin Durant";

		boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
		System.out.println(outcome);
	}

	public static void main(String[] args) {
		predicate_negate();
	}
}
