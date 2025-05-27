package java_07_comparable_and_comparator_19;

// Java program demonstrate how to Sort LinkedHashSet using
// Comparable interface
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Student class implements comparable interface
class Student implements Comparable<Student> {
	
	Integer marks;

	Student(Integer marks) {
		this.marks = marks;
	}

	// override toString method
	public String toString() {
		return (" " + this.marks);
	}

	// Override compareTo method to sort LinkedHashSet in
	// descending order
	public int compareTo(Student stu) {
		return stu.marks.compareTo(this.marks);
	}
}

public class Java_09B_How_To_Sort_LinkedHashSet_Elements_Using_Comparable_Interface_In_Java {
	
	public static void main(String[] args) {

		// New LinkedHashSet
		LinkedHashSet<Student> set = new LinkedHashSet<>();

		// Adding elements to the set
		set.add(new Student(500));
		set.add(new Student(300));
		set.add(new Student(400));
		set.add(new Student(100));
		set.add(new Student(200));

		// Print Before sort
		System.out.println("Before sort elements in descending order : " + set);

		// TreeSet to sort LinkedHashSet using comparable
		TreeSet<Student> tree_set = new TreeSet<>(set);

		// Print after sorting
		System.out.println("After sort elements in descending order : " + tree_set);
	}
}