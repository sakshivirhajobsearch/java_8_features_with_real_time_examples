package java_01_lambda_expressions_34;

interface Display {
	void show();
}

public class Java_08D_Match_Lambdas_To_Interfaces_In_Java {

	public static void main(String[] args) {

		Display display = () -> System.out.println("Welcome");

		display.show();

	}
}