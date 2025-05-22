package java_04_streams_76;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Main class
public class Java_02A_Difference_Between_Streams_And_Collections_In_Java {

	// Main driver method
	public static void main(String[] args) {
		// Creating an instance of list
		List<String> companyList = new ArrayList<>();

		// Adding elements using add() method
		companyList.add("Google");
		companyList.add("Apple");
		companyList.add("Microsoft");

		// Now creating a comparator
		Comparator<String> com = (String o1, String o2) -> o1.compareTo(o2);

		// Sorting the list
		Collections.sort(companyList, com);

		// Iterating using for each loop
		for (String name : companyList) {

			// Printing the elements
			System.out.println(name);
		}
	}
}
