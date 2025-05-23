package java_04_streams_76;

//Java Program to illustrate Collecting a Stream to
//an Immutable Collection
//Post java 10
//Using toUnmodifiableSet() method 

//Importing required libraries
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//ImmutableCollectionSet
public class Java_12E_Collecting_A_Stream_To_an_Immutable_Collection_In_Java {

	public static void main(String[] args) {
		
		// Creating Stream object of type Double
		Stream<Double> randomDecimals = Stream.generate(Math::random).limit(30);

		// Now creating Set class object of type Double
		Set<Double> randomSet = randomDecimals.collect(Collectors.toUnmodifiableSet());

		// Print and display elements in Set object
		System.out.println(randomSet);

		// This will produce an exception
		randomSet.add(100.0);
	}
}