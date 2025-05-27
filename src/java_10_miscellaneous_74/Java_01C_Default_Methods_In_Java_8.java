package java_10_miscellaneous_74;

//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface TestInterface1 {
	// default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {
	// Default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

//Implementation class code
public class Java_01C_Default_Methods_In_Java_8 implements TestInterface1, TestInterface2 {

	// Overriding default show method
	public void show() {

		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();

		// use super keyword to call the show
		// method of TestInterface2 interface
		TestInterface2.super.show();
	}

	public static void main(String args[]) {
		Java_01C_Default_Methods_In_Java_8 d = new Java_01C_Default_Methods_In_Java_8();
		d.show();
	}
}