package java_01_lambda_expressions_34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Java Program to remove nulls
//from a List using Java 8
import java.util.function.Predicate;

public class Java_11D_Remove_Elements_From_A_List_that_Satisfy_A_Given_Predicate_In_Java {

	// Generic function to remove elements using Predicate
	public static <T> List<T> removeElements(List<T> l, Predicate<T> p) {

		// Removing nulls using Java Stream
		// using Predicate condition in removeIf()
		l.removeIf(x -> p.test(x));

		// Return the list
		return l;
	}

	public static void main(String[] args) {

		// Create a list with null values
		List<String> l = new ArrayList<>(Arrays.asList("Geeks", null, "forGeeks", null, "A computer portal"));

		// Print the list
		System.out.println("List with null values: " + l);

		// Creating a Predicate condition checking for null
		Predicate<String> isNull = i -> (i == null);

		// Removing using Predicate
		l = removeElements(l, isNull);

		// Print the list
		System.out.println("List with null values removed: " + l);
	}
}
