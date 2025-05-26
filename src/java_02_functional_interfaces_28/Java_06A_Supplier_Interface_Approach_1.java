package java_02_functional_interfaces_28;

//Handling Multiple Conditions 
//with the help of Function
import java.util.function.Function;

public class Java_06A_Supplier_Interface_Approach_1 {

	public static void main(String args[]) {

		Function<Integer, Integer> addFive = a -> a + 5;
		Function<Integer, Integer> multiplyByTwo = a -> a * 2;

		// Applying functions sequentially: Add five, then multiply by two
		Function<Integer, Integer> result = addFive.andThen(multiplyByTwo);

		System.out.println(result.apply(3));
	}
}
