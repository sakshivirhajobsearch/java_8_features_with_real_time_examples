package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PersonA {

	private String name;
	private Integer age;

	// Constructor
	public PersonA(String name, int age) {
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
	public static int compareByName(PersonA a, PersonA b) {
		return a.getName().compareTo(b.getName());
	}

	// Static method to compare by age
	public static int compareByAge(PersonA a, PersonA b) {
		return a.getAge().compareTo(b.getAge());
	}
}

public class Java_01B_method_references {

	public static void main(String[] args) {

		List<PersonA> personList = new ArrayList<>();
		personList.add(new PersonA("Vicky", 24));
		personList.add(new PersonA("Poonam", 25));
		personList.add(new PersonA("Sachin", 19));

		// Sort by name using method reference
		Collections.sort(personList, PersonComparator::compareByName);

		System.out.println("Sort by Name:");
		personList.stream().map(PersonA::getName).forEach(System.out::println);

		System.out.println();

		// Sort by age using method reference
		Collections.sort(personList, PersonComparator::compareByAge);

		System.out.println("Sort by Age:");
		personList.stream().map(PersonA::getName).forEach(System.out::println);
	}
}
