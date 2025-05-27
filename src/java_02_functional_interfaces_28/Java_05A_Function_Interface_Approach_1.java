package java_02_functional_interfaces_28;

//Java Program to Illustrate Functional Interface
//Via apply() method

//Importing interface
import java.util.function.Function;

public class Java_05A_Function_Interface_Approach_1 {

	public static void main(String args[]) {
		
		// Function which takes in a number
		// and returns half of it
		Function<Integer, Double> half = a -> a / 2.0;

		// Applying the function to get the result
		System.out.println(half.apply(10));
	}
}
