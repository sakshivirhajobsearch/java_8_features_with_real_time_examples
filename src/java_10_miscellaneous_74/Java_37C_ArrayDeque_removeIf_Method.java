package java_10_miscellaneous_74;

//Java Program Demonstrate removeIf()
//method of ArrayDeque
import java.util.ArrayDeque;

public class Java_37C_ArrayDeque_removeIf_Method {

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

		try {
			// apply removeIf() method with null filter
			students.removeIf(null);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}