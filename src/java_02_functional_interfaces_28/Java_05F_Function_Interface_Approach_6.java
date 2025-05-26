package java_02_functional_interfaces_28;

//Java Program to Illustrate identity() method

//Importing Function interface
import java.util.function.Function;

//Main class
public class Java_05F_Function_Interface_Approach_6 {

	// Main driver method
	public static void main(String args[]) {
		
		// Function which takes in a number and
		// returns it
		Function<Integer, Integer> i = Function.identity();

		System.out.println(i.apply(10));
	}
}
