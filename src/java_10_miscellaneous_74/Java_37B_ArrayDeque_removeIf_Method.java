package java_10_miscellaneous_74;

//Java Program Demonstrate removeIf()
//method of ArrayDeque
import java.util.ArrayDeque;

public class Java_37B_ArrayDeque_removeIf_Method {

	public static void main(String[] args) {

		// create an ArrayDeque
		// containing a list of Student objects
		ArrayDeque<student> students = new ArrayDeque<student>();

		// Add student object to list
		students.add(new student("Aman", 78));
		students.add(new student("Amar", 79));
		students.add(new student("Suraj", 38));
		students.add(new student("Raju", 22));
		students.add(new student("Ankit", 76));
		students.add(new student("Sanju", 62));

		// apply removeIf() method
		// to remove students who scores below 40
		students.removeIf(n -> (n.marks <= 40));

		System.out.println("Students list who score above 40");

		// print list
		for (student str : students) {
			System.out.println(str.name + ", " + str.marks);
		}
	}
}

//create student class
class student {

	public String name;
	public int marks;

	student(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}
}
