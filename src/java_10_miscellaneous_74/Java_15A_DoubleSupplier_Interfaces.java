package java_10_miscellaneous_74;

//Java Program to illustrate
//getAsDouble method of
//DoubleSupplier Interface
import java.util.function.DoubleSupplier;

public class Java_15A_DoubleSupplier_Interfaces {

	public static void main(String args[]) {

		// Create a DoubleSupplier instance
		DoubleSupplier sup = () -> Math.random();

		// Get the double value
		// Using getAsDouble() method
		System.out.println(sup.getAsDouble());
	}
}