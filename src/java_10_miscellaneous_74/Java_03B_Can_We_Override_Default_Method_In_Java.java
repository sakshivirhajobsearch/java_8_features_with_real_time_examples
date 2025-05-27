package java_10_miscellaneous_74;

//Java program to demonstrate the case when 
//two interfaces are not overridden

//Creating Interface One
interface GfG {
	public default void display() {
		System.out.println("GEEKSFORGEEKS");
	}
}

//Creating Interface Two
interface gfg {

	public default void display() {
		System.out.println("geeksforgeeks");
	}
}

//Interfaces are not Overridden 
public class Java_03B_Can_We_Override_Default_Method_In_Java implements GfG, gfg {
	
	public static void main(String args[]) {
		Java_03B_Can_We_Override_Default_Method_In_Java obj = new Java_03B_Can_We_Override_Default_Method_In_Java();
		obj.display();
	}
}