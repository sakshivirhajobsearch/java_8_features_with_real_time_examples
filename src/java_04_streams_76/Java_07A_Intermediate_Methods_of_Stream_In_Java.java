package java_04_streams_76;

//Importing List Class from java.util package  
import java.util.List;

public class Java_07A_Intermediate_Methods_of_Stream_In_Java {

	public static void main(String[] args) {

		// Creating an object of List Class by
		// declaring a list of Integers

		// Custom entries in the list elements
		List<Integer> intList = List.of(15, 20, 48, 63, 49, 27, 56, 32, 9);

		// Calling the function to
		// print the list of Even numbers
		printEvenNumber(intList);
	}

// Method 2
// Helper method 
// To print the even numbers using filter method. 
	private static void printEvenNumber(List<Integer> intList) {

		// Display message
		System.out.print("\nEven numbers are : ");

		// Illustrating filter method usage
		intList.stream().filter(element -> (element % 2 == 0)).forEach(element -> System.out.print(element + " "));

	}
}
