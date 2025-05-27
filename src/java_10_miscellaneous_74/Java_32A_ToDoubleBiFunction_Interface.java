package java_10_miscellaneous_74;

import java.util.function.ToDoubleBiFunction;

public class Java_32A_ToDoubleBiFunction_Interface {

	public static void main(String args[]) {

		ToDoubleBiFunction<Integer, String> ob = (a, b) -> a + Integer.parseInt(b) * 3.2;

		// Using applyAsDouble()
		System.out.println(ob.applyAsDouble(3, "10"));
	}
}
