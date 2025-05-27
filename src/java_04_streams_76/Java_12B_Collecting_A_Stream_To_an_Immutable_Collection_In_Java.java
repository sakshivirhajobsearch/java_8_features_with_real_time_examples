package java_04_streams_76;

// Java Program to illustrate Collecting a 
// Stream to an Immutable Collection
// Pre java 10  Using Google’s Guava library

// Importing Guava library
import com.google.common.collect.ImmutableList;
// Importing classes from java.util package
import java.util.List;
import java.util.stream.IntStream;

// Main class
public class Java_12B_Collecting_A_Stream_To_an_Immutable_Collection_In_Java {

	// main driver method
	public static void main(String[] args) {

		// Using the Guava Libraries
		List<Integer> someList = IntStream.range(0, 15).boxed().collect(ImmutableList.toImmutableList());

		// Print and display the elements
		System.out.println(someList);
	}
}