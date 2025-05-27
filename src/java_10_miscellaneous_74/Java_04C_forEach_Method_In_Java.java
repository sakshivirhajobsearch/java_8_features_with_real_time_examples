package java_10_miscellaneous_74;

//Java program to demonstrate 
//conditional actions using forEach()
import java.util.ArrayList;

public class Java_04C_forEach_Method_In_Java {

	public static void main(String[] args) {

		// Create an ArrayList of Integers
		ArrayList<Integer> a = new ArrayList<>();
		a.add(24);
		a.add(18);
		a.add(10);

		// Use forEach() to print
		// ages that are 18 or above
		a.forEach(age -> {
			if (age >= 18) {
				System.out.println("Eligible age: " + age);
			}
		});
	}
}