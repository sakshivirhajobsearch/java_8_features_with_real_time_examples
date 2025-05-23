package java_01_lambda_expressions_34;

//Interface
@FunctionalInterface
interface display {

	// Attribute
	void show(String msg);

	// Method
	// To compute the sum
	default int doSum(int a, int b) {
		return a + b;
	}
}

//Main class implementing the above interface
public class Java_08A_Match_Lambdas_To_Interfaces_In_Java implements display {

	// Overriding the existing show() method
	@Override

	public void show(String msg) {

		// Print message
		System.out.println(msg);
	}

	// Main driver method
	public static void main(String[] args) {

		// Creating object of class inside main()
		Java_08A_Match_Lambdas_To_Interfaces_In_Java object = new Java_08A_Match_Lambdas_To_Interfaces_In_Java();

		// Calling show() method in main()
		object.show("Hello World!");

		// Print statement
		System.out.println(object.doSum(2, 3));
	}
}
