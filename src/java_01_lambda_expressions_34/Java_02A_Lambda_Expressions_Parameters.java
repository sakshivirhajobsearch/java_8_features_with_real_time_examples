package java_01_lambda_expressions_34;

//Java code to illustrate lambda expression
//without parameters

//functional interface
//without parameters
interface Test1 {
	void print();
}

public class Java_02A_Lambda_Expressions_Parameters {

	// functional interface parameter is passed
	static void fun(Test1 t) {
		t.print();
	}

	public static void main(String[] args) {

		// lambda expression is passed
		// without parameter to functional interface t
		fun(() -> System.out.println("Hello"));
	}
}