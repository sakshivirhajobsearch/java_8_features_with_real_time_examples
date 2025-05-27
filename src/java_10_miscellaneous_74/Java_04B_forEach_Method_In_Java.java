package java_10_miscellaneous_74;

//Java program to demonstrate 
//custom actions using forEach()
import java.util.ArrayList;

public class Java_04B_forEach_Method_In_Java {

	public static void main(String[] args) {

		// Create an ArrayList of Integers
		ArrayList<Integer> n = new ArrayList<>();
		n.add(2);
		n.add(3);
		n.add(4);

		// Use forEach() to print the
		// square of each number
		n.forEach(num -> System.out.println(num * num));
	}
}
