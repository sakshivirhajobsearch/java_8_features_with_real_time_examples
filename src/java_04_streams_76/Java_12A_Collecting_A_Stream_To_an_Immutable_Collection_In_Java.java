package java_04_streams_76;

//Java Program to illustrate Collecting a Stream to an
//Immutable Collection
//Pre java 10 
//Using collectingAndThen method

//Importing Collections, Collectors and Stream classes
//from java.util package
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Main class
//PreJava10ImmutableCollections
public class Java_12A_Collecting_A_Stream_To_an_Immutable_Collection_In_Java {

	public static void main(String[] args) {

		// Custom inputs integer elements in List
		var unmodifiableList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

		System.out.println(unmodifiableList);

		// Operations like this will result in an exception
		unmodifiableList.add(12);
	}
}