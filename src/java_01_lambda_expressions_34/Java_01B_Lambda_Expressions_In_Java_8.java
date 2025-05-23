package java_01_lambda_expressions_34;

//Java program to demonstrates Lambda expression with zero parameter
@FunctionalInterface
interface ZeroParameter {
	void display();
}

public class Java_01B_Lambda_Expressions_In_Java_8 {

	public static void main(String[] args) {

		// Lambda expression with zero parameters
		ZeroParameter zeroParamLambda = () -> System.out.println("This is a zero-parameter lambda expression!");

		// Invoke the method
		zeroParamLambda.display();
	}
}