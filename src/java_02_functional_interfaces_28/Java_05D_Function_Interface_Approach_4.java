package java_02_functional_interfaces_28;

//Java Program to illustrate compose() method

//Importing Function interface
import java.util.function.Function;

public class Java_05D_Function_Interface_Approach_4 {

	public static void main(String args[]) {
		
		// Function which takes in a number and
		// returns half of it
		Function<Integer, Double> half = a -> a / 2.0;

		// Triple the value given to half function
		half = half.compose(a -> 3 * a);

		// Applying the function to get the result
		System.out.println(half.apply(5));
	}
}
