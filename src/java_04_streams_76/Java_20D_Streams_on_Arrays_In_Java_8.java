package java_04_streams_76;

import java.util.Arrays;

public class Java_20D_Streams_on_Arrays_In_Java_8 {
	
	public static void main(String[] args) {
		
		int arr_sample1[] = { 11, 2, 3, 42, 5, 6, 17, 8, 9, 10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20 };
		System.out.println("These method convert Optional to primitive");

		// OptionalDouble can be converted to double by using getAsDouble()
		// if average doesn't contains any value it throws NoSuchElementException
		System.out.println("Example of average() : ");
		System.out.println((Arrays.stream(arr_sample1).average().getAsDouble()));

		// OptionalInt can be converted to int by using getAsInt()
		System.out.println("Example of findAny() : ");
		System.out.println(Arrays.stream(arr_sample1).findAny().getAsInt());
	}
}