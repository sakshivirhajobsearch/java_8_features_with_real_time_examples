package java_01_lambda_expressions_34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
//Java Program to remove nulls
//from a List using iterator and Predicate
import java.util.function.Predicate;

public class Java_11A_Remove_Elements_From_A_List_that_Satisfy_A_Given_Predicate_In_Java {

	// Generic function to remove Null Using Iterator
	public static <T> List<T> removeNullUsingIterator(List<T> l, Predicate<T> p) {

		// Create an iterator from the l
		Iterator<T> itr = l.iterator();

		// Find and remove all null
		while (itr.hasNext()) {

			// Fetching the next element
			T t = itr.next();

			// Checking for Predicate condition
			if (!p.test(t)) {

				// If the condition matches,
				// remove that element
				itr.remove();
			}
		}

		// Return the null
		return l;
	}

	public static void main(String[] args) {

		// Create the l with null values
		List<String> l = new ArrayList<>(Arrays.asList("Geeks", null, "forGeeks", null, "A computer portal"));

		// Print the list
		System.out.println("List with null values: " + l);

		// Creating a Predicate condition checking for null
		Predicate<String> isNull = item -> Objects.nonNull(item);

		// Removing nulls using iterator and Predicate
		l = removeNullUsingIterator(l, isNull);

		// Print the list
		System.out.println("List with null values removed: " + l);
	}
}