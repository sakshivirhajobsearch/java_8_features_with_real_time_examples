package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Person class with name and age attributes
class PersonB {

	private String name;
	private Integer age;

	public PersonB(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

// Comparator provider class with instance methods
class ComparisonProvider {

	// Compare by name
	public int compareByName(PersonB a, PersonB b) {
		return a.getName().compareTo(b.getName());
	}

	// Compare by age
	public int compareByAge(PersonB a, PersonB b) {
		return a.getAge().compareTo(b.getAge());
	}
}

public class Java_01C_method_references {

	public static void main(String[] args) {

		List<PersonB> personList = new ArrayList<>();
		personList.add(new PersonB("Vicky", 24));
		personList.add(new PersonB("Poonam", 25));
		personList.add(new PersonB("Sachin", 19));

		ComparisonProvider comparator = new ComparisonProvider();

		// Sort by name using instance method reference
		Collections.sort(personList, comparator::compareByName);
		System.out.println("Sort by Name:");
		personList.stream().map(PersonB::getName).forEach(System.out::println);

		System.out.println();

		// Sort by age using instance method reference
		Collections.sort(personList, comparator::compareByAge);
		System.out.println("Sort by Age:");
		personList.stream().map(PersonB::getName).forEach(System.out::println);
	}
}
