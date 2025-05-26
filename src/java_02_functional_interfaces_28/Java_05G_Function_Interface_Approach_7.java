package java_02_functional_interfaces_28;

//Demonstrates the working of functional interface
import java.util.function.Function;

//create a Person class with properties 
//name and age
class Person {
	
	String name;
	int age;

	// creates a constructor
	Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	// override the toString() method to
	// display the person details
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
}

public class Java_05G_Function_Interface_Approach_7 {
	
	public static void main(String args[]) {

		// create a Function that takes object and
		// returns a greeting with the person's name
		Function<Person, String> greet = person -> "Hello, " + person.name;

		Person p = new Person("Geek1", 25);
		System.out.println(greet.apply(p));
	}
}
