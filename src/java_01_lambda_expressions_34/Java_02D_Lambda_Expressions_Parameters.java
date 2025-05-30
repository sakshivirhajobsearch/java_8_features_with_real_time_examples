package java_01_lambda_expressions_34;

//Demonstrate a lambda expression that takes two parameters

interface NumericTest2 {
	boolean test(int n, int d);
}

public class Java_02D_Lambda_Expressions_Parameters {

	public static void main(String args[]) {

		// The lambda expression here determines if one number is the factor of another
		NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		if (isFactor.test(10, 2))
			System.out.println("2 is the factor of 10");

		if (!isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");

	}
}
