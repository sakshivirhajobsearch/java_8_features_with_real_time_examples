package java_10_miscellaneous_74;

//Java Program Demonstrate removeIf()
//method of ArrayDeque
import java.util.ArrayDeque;

public class Java_37A_ArrayDeque_removeIf_Method {

	public static void main(String[] args) {

		// create an ArrayDeque
		// containing a list of string values
		ArrayDeque<String> students = new ArrayDeque<String>();

		// Add Strings to list
		// each string represents student name
		students.add("Aman");
		students.add("Sanjeet");
		students.add("Amar");
		students.add("Rabi");
		students.add("Shabbir");

		// apply removeIf() method
		// to remove names which start with A
		students.removeIf(n -> (n.charAt(0) == 'A'));

		System.out.println("Students name do not starts with A");

		// print list
		for (String str : students) {
			System.out.println(str);
		}
	}
}