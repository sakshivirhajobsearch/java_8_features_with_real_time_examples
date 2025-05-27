package java_10_miscellaneous_74;

//Java program to demonstrate the case
//when two interfaces are overridden

//Creating Interface One
interface GfG2 {
	public default void display() {
		System.out.println("GEEKSFORGEEKS");
	}
}

//Creating Interface Two
interface gfg2 {

	public default void display() {
		System.out.println("geeksforgeeks");
	}
}

public class Java_03C_Can_We_Override_Default_Method_In_Java implements GfG2, gfg2 {

//Interfaces are Overrided
	public void display() {

		GfG1.super.display();

		gfg1.super.display();
	}

	public static void main(String args[]) {
		Java_03C_Can_We_Override_Default_Method_In_Java obj = new Java_03C_Can_We_Override_Default_Method_In_Java();
		obj.display();
	}
}