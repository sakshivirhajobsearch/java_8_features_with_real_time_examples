package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Java_01B_method_references {

	private String name;
	private Integer age;

	// Constructor
	public Java_01B_method_references(String name, int age) {

		this.name = name;
		this.age = age;
	}

	// Getters
	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

class PersonComparator {

	// Static method to compare by name
	public static int compareByName(Java_01B_method_references a, Java_01B_method_references b) {
		return a.getName().compareTo(b.getName());
	}

	// Static method to compare by age
	public static int compareByAge(Java_01B_method_references a, Java_01B_method_references b) {
		return a.getAge().compareTo(b.getAge());
	}
}

class Java_01B1_method_references {

	public static void main(String[] args) {

		List<Java_01B_method_references> personList = new ArrayList<>();
		personList.add(new Java_01B_method_references("Vicky", 24));
		personList.add(new Java_01B_method_references("Poonam", 25));
		personList.add(new Java_01B_method_references("Sachin", 19));

		// Sort by name using method reference
		Collections.sort(personList, PersonComparator::compareByName);

		System.out.println("Sort by Name:");
		personList.stream().map(Java_01B_method_references::getName).forEach(System.out::println);

		System.out.println();

		// Sort by age using method reference
		Collections.sort(personList, PersonComparator::compareByAge);

		System.out.println("Sort by Age:");
		personList.stream().map(Java_01B_method_references::getName).forEach(System.out::println);
	}
}
