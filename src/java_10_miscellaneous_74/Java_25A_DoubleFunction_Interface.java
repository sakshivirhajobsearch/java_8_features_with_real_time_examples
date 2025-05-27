package java_10_miscellaneous_74;

import java.util.function.DoubleFunction;

public class Java_25A_DoubleFunction_Interface {

	public static void main(String args[]) {
		
		DoubleFunction<Integer> ob = a -> (int) (a * 10);

		// Using apply() method
		System.out.println(ob.apply(3.2));
	}
}
