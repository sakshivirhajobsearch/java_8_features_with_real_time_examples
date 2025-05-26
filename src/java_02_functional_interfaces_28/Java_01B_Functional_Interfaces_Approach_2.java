package java_02_functional_interfaces_28;

//Define a functional interface
@FunctionalInterface

interface Square {
	int calculate(int x);
}

public class Java_01B_Functional_Interfaces_Approach_2 {
	
	public static void main(String args[]) {
		
		int a = 5;

		// lambda expression to
		// define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}