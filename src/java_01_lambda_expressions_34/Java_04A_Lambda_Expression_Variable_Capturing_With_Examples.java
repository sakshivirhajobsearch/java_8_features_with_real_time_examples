package java_01_lambda_expressions_34;

//Inrterface
interface MyFunction {

	// Method inside the interface
	int func(int n);
}

public class Java_04A_Lambda_Expression_Variable_Capturing_With_Examples {

	public static void main(String[] args) {

		// Custom local variable that can be captured
		int number = 10;

		MyFunction myLambda = (n) -> {

			// This use of number is OK It does not modify
			// num
			int value = number + n;

			// However, the following is illegal because it
			// attempts to modify the value of number

			// number++;
			return value;
		};

		// Using the Lambda expression
		System.out.println(myLambda.func(20));
		System.out.println("GFG!");
	}
}
