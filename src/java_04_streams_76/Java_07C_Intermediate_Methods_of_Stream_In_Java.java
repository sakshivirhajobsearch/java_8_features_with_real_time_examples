package java_04_streams_76;

//Importing List class from java.util package
import java.util.List;

//Main Class
public class Java_07C_Intermediate_Methods_of_Stream_In_Java {

	// Method 1
	// To find distinct elements from the List
	public static void findDistinctElements(List<Integer> intList) {
		intList.stream().distinct().forEach(element -> System.out.print(element + " "));

		// Display message only
		System.out.println("\n\nSorted List is ");

		// Also we are sorting elements at the same time
		intList.stream().distinct().sorted().forEach(element -> System.out.print(element + " "));
	}

	// Method 2
	public static void main(String[] args) {

		// Creating an object of List class
		// Declaring object of Integer type

		// Custom integer inputs
		List<Integer> intList = List.of(12, 54, 63, 12, 7, 98, 63, 54, 72);

		// Calling the Method 1 as above created to
		// find the distinct elements from the list
		findDistinctElements(intList);
	}
}
