package java_10_miscellaneous_74;

//A simple Java program to TestClassnstrate static
//methods in java
interface TestInterface {
	// abstract method
	public void square(int a);

	// static method
	static void show() {
		System.out.println("Static Method Executed");
	}
}

public class Java_01B_Default_Methods_In_Java_8 implements TestInterface {
	
	// Implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		Java_01B_Default_Methods_In_Java_8 d = new Java_01B_Default_Methods_In_Java_8();
		d.square(4);

		// Static method executed
		TestInterface.show();
	}
}