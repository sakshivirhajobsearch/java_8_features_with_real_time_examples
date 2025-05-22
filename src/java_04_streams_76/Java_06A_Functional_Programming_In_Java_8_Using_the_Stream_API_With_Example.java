package java_04_streams_76;

import java.util.ArrayList;
import java.util.stream.Stream;

//Class
public class Java_06A_Functional_Programming_In_Java_8_Using_the_Stream_API_With_Example {

	// Main driver method
	public static void main(String[] args) {
		// Data Source

		// Creating an arrayList object
		// Declaring object of String type
		ArrayList<String> gfgNames = new ArrayList<>();

		// Custom input elements to above object
		gfgNames.add("Dean");
		gfgNames.add("castee");
		gfgNames.add("robert");

		// Creating object of Stream where Stream is created
		// using arrayList and object as data source
		Stream<String> streamOfNames = gfgNames.stream();

		// Print and display element
		System.out.print(streamOfNames);
	}
}