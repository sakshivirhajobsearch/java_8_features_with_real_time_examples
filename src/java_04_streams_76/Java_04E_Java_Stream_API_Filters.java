package java_04_streams_76;

import java.util.Arrays;
import java.util.List;

public class Java_04E_Java_Stream_API_Filters {

	// Employee class
	class Employee {

		// attributes of an Employee
		String name;
		int age;

		// constructor
		Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// Override toString to print
		// provided content when an Object
		// is printed
		@Override
		public String toString() {
			return "Employee [name=" + name + "]";
		}
	}

	public static void filterByAge() {
		// create list of Employees
		List<Employee> myList = Arrays.asList(new Java_04E_Java_Stream_API_Filters().new Employee("Ram", 25),
				new Java_04E_Java_Stream_API_Filters().new Employee("Kumar", 40),
				new Java_04E_Java_Stream_API_Filters().new Employee("Rakesh", 35));

		// create a stream on the list
		// filter by age of an employee
		myList.stream().filter(x -> x.age >= 35).forEach(System.out::println);
	}

	public static void main(String[] args) {
		filterByAge();
	}
}
