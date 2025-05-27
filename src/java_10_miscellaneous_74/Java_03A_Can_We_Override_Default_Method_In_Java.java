package java_10_miscellaneous_74;

//Creating Interface
interface GfG {

	public default void display() {
		System.out.println("GEEKSFORGEEKS");
	}
}

//Main Class With Implementation Of Interface
public class Java_03A_Can_We_Override_Default_Method_In_Java implements GfG {

	public static void main(String args[]) {

		Java_03A_Can_We_Override_Default_Method_In_Java obj = new Java_03A_Can_We_Override_Default_Method_In_Java();

		// Calling Interface
		obj.display();
	}
}