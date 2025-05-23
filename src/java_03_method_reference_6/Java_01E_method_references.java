package java_03_method_reference_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

//Object need to be sorted
class Java_01E_method_references {

	private String name;
	private Integer age;

	// Constructor
	public Java_01E_method_references() {
		Random ran = new Random();

		// Assigning a random value
		// to name
		this.name = ran.ints(97, 122 + 1).limit(7)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

class Java_01E1_method_references {

	// Get List of objects of given
	// length and Supplier
	public static <T> List<T> getObjectList(int length, Supplier<T> objectSupply) {
		List<T> list = new ArrayList<>();

		for (int i = 0; i < length; i++)
			list.add(objectSupply.get());
		return list;
	}

	public static void main(String[] args) {

		// Get 10 person by supplying
		// person supplier, Supplier is
		// created by person constructor
		// reference
		List<Java_01E_method_references> personList = getObjectList(5, Java_01E_method_references::new);

		// Print names of personList
		personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}