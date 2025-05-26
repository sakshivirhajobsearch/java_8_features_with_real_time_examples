package java_07_comparable_and_comparator_19;

import java.io.*;
import java.util.*;

class Triplet implements Comparable<Triplet> {
	
	int x;
	int y;
	int z;

	public Triplet(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

	// Overridden method to compare
	// values of the last element.
	public int compareTo(Triplet a) {
		return this.z - a.z;
	}
}

public class Java_04A_Sort_an_Array_of_Triplet_Using_Java_Comparable_And_Comparator {

	public static void main(String[] args) {

		int n = 4;
		Triplet arr[] = new Triplet[n];

		arr[0] = new Triplet(1, 2, 3);
		arr[1] = new Triplet(2, 2, 4);
		arr[2] = new Triplet(5, 6, 1);
		arr[3] = new Triplet(10, 2, 10);

		// Sorting the array
		Arrays.sort(arr);

		// printing the
		// Triplet array
		print(arr);
	}

	public static void print(Triplet[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
