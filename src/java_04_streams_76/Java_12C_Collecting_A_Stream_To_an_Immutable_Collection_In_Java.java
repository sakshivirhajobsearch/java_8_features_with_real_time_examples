package java_04_streams_76;

//Java Program to illustrate Collecting a Stream to
//an Immutable Collection
//Post java 10
//using toUnmodifiableList() method 

//Importing classes from java.util package
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Main Class
//ImmutableCollectionList
public class Java_12C_Collecting_A_Stream_To_an_Immutable_Collection_In_Java {

	public static void main(String[] args) {
		
		// Creating Stream class object of integer type
		Stream<Integer> evenNumberStream = Stream.iterate(0, i -> i + 2).limit(50);

		// Creating List class object of integer type
		List<Integer> evenNumbers = (List<Integer>) evenNumberStream.collect(Collectors.toUnmodifiableList());

		// Print all elements in the List object
		System.out.println(evenNumbers);

		// These will result in
		// java.lang.UnsupportedOperationException

		evenNumbers.add(90);
		// evenNumbers.remove(1);
	}
}