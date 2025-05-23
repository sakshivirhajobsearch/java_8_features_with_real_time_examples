package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_01D_method_references {

	public static void main(String[] args) {

		// Creating an empty ArrayList of user defined type
		// List of person
		List<String> personList = new ArrayList<>();

		// Adding elements to above object of List
		// using add() method
		personList.add("Vicky");
		personList.add("Poonam");
		personList.add("Sachin");

		// Method reference to String type
		Collections.sort(personList, String::compareToIgnoreCase);

		// Printing the elements(names) on console
		personList.forEach(System.out::println);
	}
}