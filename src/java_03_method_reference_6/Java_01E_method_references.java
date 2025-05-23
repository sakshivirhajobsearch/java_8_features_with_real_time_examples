package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

// Object to be created and sorted
class PersonC {

	private final String name;
	private final Integer age;

	// Constructor
	public PersonC() {
		Random ran = new Random();

		// Assigning a random value to name (7 lowercase letters)
		this.name = ran.ints('a', 'z' + 1).limit(7)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		// Assigning a random age between 18 and 60 (inclusive)
		this.age = ran.nextInt(43) + 18;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

public class Java_01E_method_references {

	// Get List of objects of given length and Supplier
	public static <T> List<T> getObjectList(int length, Supplier<T> objectSupplier) {
		List<T> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			list.add(objectSupplier.get());
		}
		return list;
	}

	public static void main(String[] args) {
		// Get 5 persons using Person constructor reference
		List<PersonC> personList = getObjectList(5, PersonC::new);

		// Print names of personList
		personList.stream().map(PersonC::getName).forEach(System.out::println);
	}
}
