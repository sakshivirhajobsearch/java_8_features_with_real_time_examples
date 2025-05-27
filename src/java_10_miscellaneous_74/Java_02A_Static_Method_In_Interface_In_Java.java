package java_10_miscellaneous_74;

//Java program to demonstrate
//static method in Interface.

interface NewInterface {

	// static method
	static void hello() {
		System.out.println("Hello, New Static Method Here");
	}

	// Public and abstract method of Interface
	void overrideMethod(String str);
}

//Implementation Class
public class Java_02A_Static_Method_In_Interface_In_Java implements NewInterface {

	public static void main(String[] args) {

		Java_02A_Static_Method_In_Interface_In_Java interfaceDemo = new Java_02A_Static_Method_In_Interface_In_Java();

		// Calling the static method of interface
		NewInterface.hello();

		// Calling the abstract method of interface
		interfaceDemo.overrideMethod("Hello, Override Method here");
	}

	// Implementing interface method

	@Override
	public void overrideMethod(String str) {
		System.out.println(str);
	}
}