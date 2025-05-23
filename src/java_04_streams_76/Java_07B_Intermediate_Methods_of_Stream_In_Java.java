package java_04_streams_76;

//Importing List class from java.util package
import java.util.List;

public class Java_07B_Intermediate_Methods_of_Stream_In_Java {

	// Method 1
	// To print the elements of the Sorted List
	public static void printSortedList(List<Integer> intList) {

		// Sorts and returns the stream to the forEach
		// illustrating stream method
		intList.stream().sorted().forEach(element -> System.out.println(element));
	}

	// Method 2
	public static void main(String[] args) {

		// Creating an object of List class
		// Declaring object of Integer type

		// Custom entries
		List<Integer> intList = List.of(68, 45, 99, 21, 8, 76, 34, 19);

		// Display message only
		System.out.println("Elements of Sorted List are as follows : ");

		// Calling the method to print the Sorted List
		printSortedList(intList);
	}
}
