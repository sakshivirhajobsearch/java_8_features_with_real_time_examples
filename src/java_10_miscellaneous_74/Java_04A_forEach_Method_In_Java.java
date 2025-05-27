package java_10_miscellaneous_74;

//Java program to demonstrate the use of forEach() 
//with an ArrayList of Strings
import java.util.ArrayList;

public class Java_04A_forEach_Method_In_Java {

	public static void main(String[] args) {

		// Create an ArrayList of Strings
		ArrayList<String> s = new ArrayList<>();
		s.add("Cherry");
		s.add("Blueberry");
		s.add("Strawberry");

		// Use forEach() to print each fruit
		s.forEach(System.out::println);
	}
}
