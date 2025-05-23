package java_01_lambda_expressions_34;

//Use a lambda expression to create a reverse comparator
import java.util.TreeSet;

public class Java_03D_Java_Lambda_Expression_With_Collections {

	public static void main(String args[]) {

		// Pass a reverse comparator to TreeSet() via a lambda expression
		TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

		// Add elements to the Treeset
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("F");
		ts.add("G");

		// Display the elements .
		for (String element : ts)
			System.out.println(element + "");

		System.out.println();
	}
}