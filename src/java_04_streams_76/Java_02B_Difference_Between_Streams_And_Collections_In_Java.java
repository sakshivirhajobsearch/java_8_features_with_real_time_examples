package java_04_streams_76;

import java.util.ArrayList;
import java.util.List;

//Main class
public class Java_02B_Difference_Between_Streams_And_Collections_In_Java {

	public static void main(String[] args) {
		// Creating an empty Arraylist
		List<String> companyList = new ArrayList<>();

		// Adding elements to above ArrayList
		companyList.add("Google");
		companyList.add("Apple");
		companyList.add("Microsoft");

		// Sorting the list
		// using sorted() method and
		// printing using for-each loop
		companyList.stream().sorted().forEach(System.out::println);
	}
}