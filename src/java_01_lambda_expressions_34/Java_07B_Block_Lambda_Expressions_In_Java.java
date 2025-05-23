package java_01_lambda_expressions_34;

//Block lambda to find out factorial
//of a number

//Interface
interface Func {
	// n is some natural number whose
	// factorial is to be computed
	int fact(int n);
}

//Class
public class Java_07B_Block_Lambda_Expressions_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Block lambda expression
		Func f = (n) -> {
			// Block body

			// Initially initializing with 1
			int res = 1;

			// iterating from 1 to the current number
			// to find factorial by multiplication
			for (int i = 1; i <= n; i++)
				res = i * res;
			return res;
		};

		// Calling lambda function

		// Print and display n the console
		System.out.println("Factorial of 5 : " + f.fact(5));
	}
}