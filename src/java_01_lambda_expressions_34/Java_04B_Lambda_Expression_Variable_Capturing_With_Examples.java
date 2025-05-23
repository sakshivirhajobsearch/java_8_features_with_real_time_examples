package java_01_lambda_expressions_34;

//Interface 
interface MyInterface {
	void myFunction();
}

public class Java_04B_Lambda_Expression_Variable_Capturing_With_Examples {

	// Custom initialization
	int data = 170;

	// Main driver method
	public static void main(String[] args) {

		// Creating object of this class
		Java_04B_Lambda_Expression_Variable_Capturing_With_Examples gfg = new Java_04B_Lambda_Expression_Variable_Capturing_With_Examples();

		// Creating object of interface
		MyInterface intFace = () -> {
			System.out.println("Data: " + gfg.data);
			gfg.data += 500;
			System.out.println("Data after modification: " + gfg.data);
		};

		// Using the lambda expression
		intFace.myFunction();

		// Modifying the instance variable
		gfg.data += 200;
		System.out.println("Final Data: " + gfg.data);
	}
}
