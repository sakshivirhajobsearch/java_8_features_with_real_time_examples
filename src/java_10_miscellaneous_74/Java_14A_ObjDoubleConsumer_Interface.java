package java_10_miscellaneous_74;

//Java code to demonstrate
//accept() method of ObjDoubleConsumer Interface

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

public class Java_14A_ObjDoubleConsumer_Interface {

	public static void main(String args[]) {

		// Get the list from which
		// the Interface is to be instantiated.
		List<Integer> arr = Arrays.asList(3, 2, 5, 7, 4);

		// Instantiate the ObjDoubleConsumer interface
		ObjDoubleConsumer<List<Integer>> func = (list, num) -> {
			list.stream().forEach(a -> System.out.println(a * num));
		};
		func.accept(arr, 2.0);
	}
}