package java_07_comparable_and_comparator_19;

//Java program demonstrate how to Sort LinkedHashMap by
//keys using Comparable interface
import java.util.*;

//Student class implements comparable interface
class Student implements Comparable<Student> {
	
	String name;

	Student(String name) {
		this.name = name;
	}

	// override toString method
	public String toString() {
		return this.name;
	}

	// Override compareTo method to sort LinkedHashMap keys
	// in descending order
	public int compareTo(Student stu) {
		return stu.name.compareTo(this.name);
	}
}

public class Java_08B_Sort_LinkedHashMap_by_Keys_Using_Comparable_Interface_In_Java {
	
	public static void main(String[] args) {

		// New LinkedHashMap
		LinkedHashMap<Student, Integer> map = new LinkedHashMap<>();

		// Adding elements to the map
		map.put(new Student("Bina"), 200);
		map.put(new Student("Akshay"), 400);
		map.put(new Student("Chintu"), 500);

		// Print Before sort
		System.out.println("Before sort keys in descending order : " + map);

		// TreeMap to sort LinkedHashMap using comparable
		TreeMap<Student, Integer> tree_map = new TreeMap<>(map);

		// Print after sorting
		System.out.println("After sort keys in descending order : " + tree_map);
	}
}