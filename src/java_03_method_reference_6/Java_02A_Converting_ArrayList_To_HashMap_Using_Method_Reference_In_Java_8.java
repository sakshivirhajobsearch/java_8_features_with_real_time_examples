package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

class Java_02A_Converting_ArrayList_To_HashMap_Using_Method_Reference_In_Java_8 {

	public static void main(String[] args) {

		// creating arraylist to add elements
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pineapple");
		fruits.add("Apple");

		// printing contents of arraylist before conversion
		System.out.println("Elements in ArrayList are : " + fruits);

		// creating new hashmap and using method reference
		// with necessary classes for the conversion
		HashMap<String, Integer> res = fruits.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, HashMap::new));

		// printing the elements of the hashmap
		System.out.println("Elements in HashMap are : " + res);
	}
}