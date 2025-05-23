package java_01_lambda_expressions_34;

import java.util.ArrayList;
import java.util.Collections;

public class Java_03A_Java_Lambda_Expression_With_Collections {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(205);
		al.add(102);
		al.add(98);
		al.add(275);
		al.add(203);
		System.out.println("Elements of the ArrayList " + "before sorting : " + al);

		// using lambda expression in place of comparator object
		Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);

		System.out.println("Elements of the ArrayList after" + " sorting : " + al);
	}
}
