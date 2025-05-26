package java_08_optional_class_34;

//Java program to demonstrate
//Optional.or() method
import java.util.Optional;

public class Java_11A_Optional_stream_Method {

	public static void main(String[] args) {

		// create a Optional
		Optional<Integer> op = Optional.of(9455);

		// print supplier
		System.out.println("Optional: " + op);

		// or supplier
		System.out.println("Optional by or(() ->" + " Optional.of(100)) method: " + op.or(() -> Optional.of(100)));
	}
}
