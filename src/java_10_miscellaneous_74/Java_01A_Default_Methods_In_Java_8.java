package java_10_miscellaneous_74;

//A simple program to Test Interface default
//methods in java
interface TestInterface {

	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}
}

public class Java_01A_Default_Methods_In_Java_8 implements TestInterface {

	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		Java_01A_Default_Methods_In_Java_8 d = new Java_01A_Default_Methods_In_Java_8();
		d.square(4);

		// default method executed
		d.show();
	}
}
