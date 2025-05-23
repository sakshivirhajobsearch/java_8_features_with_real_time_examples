package java_01_lambda_expressions_34;

//Java Program to Illustrate Lambda Expression
//with Multiple Parameter

//Importing required classes
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_08E_Match_Lambdas_To_Interfaces_In_Java {

	// main driver method
	public static void main(String[] args) {

		// Creating a List of integer type
		List<Integer> list = Arrays.asList(24, 346, 78, 90, 21, 765);

		// Printing before sorting
		System.out.println("Before sorting.");

		for (int i : list)
			System.out.print(i + " ");

		System.out.println();

		// Sort the integers based on second digit
		Collections.sort(list, (a1, a2) -> {
			return a1 % 10 > a2 % 10 ? 1 : -1;
		});

		// Printing after sorting
		System.out.println("After sorting.");

		for (int i : list)
			System.out.print(i + " ");

		System.out.println();
	}
}