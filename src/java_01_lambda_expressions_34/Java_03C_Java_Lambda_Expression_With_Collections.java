package java_01_lambda_expressions_34;

import java.util.TreeMap;

public class Java_03C_Java_Lambda_Expression_With_Collections {

	public static void main(String[] args) {

		TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		m.put(1, "Apple");
		m.put(4, "Mango");
		m.put(5, "Orange");
		m.put(2, "Banana");
		m.put(3, "Grapes");
		System.out.println("Elements of the TreeMap " + "after sorting are : " + m);
	}
}