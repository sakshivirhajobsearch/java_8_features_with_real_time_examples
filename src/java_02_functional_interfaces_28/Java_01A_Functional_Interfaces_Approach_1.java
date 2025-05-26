package java_02_functional_interfaces_28;

public class Java_01A_Functional_Interfaces_Approach_1 {

	public static void main(String[] args) {

		// Using lambda expression
		// to implement Runnable
		new Thread(() -> System.out.println("New thread created")).start();
	}
}
