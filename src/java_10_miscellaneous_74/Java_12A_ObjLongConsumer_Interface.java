package java_10_miscellaneous_74;

//Java code to demonstrate
//accept() method of ObjLongConsumer Interface

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjLongConsumer;

public class Java_12A_ObjLongConsumer_Interface {

	public static void main(String args[]) {

		// Get the list from which
		// the Interface is to be instantiated.
		List<Integer> arr = Arrays.asList(3, 2, 5, 7, 4);

		// Instantiate the ObjLongConsumer interface
		ObjLongConsumer<List<Integer>> func = (list, num) -> {
			list.stream().forEach(a -> System.out.println(a * num));
		};
		func.accept(arr, 200000);
	}
}