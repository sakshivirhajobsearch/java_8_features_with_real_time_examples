package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Java_01C_method_references {

	// Attributes of a person
	private String name;
	private Integer age;

	// Constructor
	public Java_01C_method_references(String name, int age) {
		// This keyword refers to current object itself
		this.name = name;
		this.age = age;
	}

	// Getter-setter methods
	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

//Helper class
//Comparator class
class ComparisonProvider {
	// To compare with name
	public int compareByName(Java_01C_method_references a, Java_01C_method_references b) {
		return a.getName().compareTo(b.getName());
	}

	// To compare with age
	public int compareByAge(Java_01C_method_references a, Java_01C_method_references b) {
		return a.getAge().compareTo(b.getAge());
	}
}

//Main class
class Java_01C1_method_references {
	public static void main(String[] args) {
		// Creating an empty ArrayList of user-defined type
		// List of person
		List<Java_01C_method_references> personList = new ArrayList<>();

		// Adding elements to above object
		// using add() method
		personList.add(new Java_01C_method_references("Vicky", 24));
		personList.add(new Java_01C_method_references("Poonam", 25));
		personList.add(new Java_01C_method_references("Sachin", 19));

		// A comparator class with multiple
		// comparator methods
		ComparisonProvider comparator = new ComparisonProvider();

		// Now using instance method reference
		// to sort array by name
		Collections.sort(personList, comparator::compareByName);

		// Display message only
		System.out.println("Sort by Name :");

		// Using streams
		personList.stream().map(x -> x.getName()).forEach(System.out::println);

		System.out.println();

		// Using instance method reference
		// to sort array by age
		Collections.sort(personList, comparator::compareByAge);

		// Display message only
		System.out.println("Sort by Age :");

		personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}