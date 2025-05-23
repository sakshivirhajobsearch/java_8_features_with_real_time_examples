package java_06_stream_methods_84;

//Using stream sorted to sort a stream
//of user defined class objects
import java.util.ArrayList;
import java.util.List;

public class Java_10C_Stream_sorted_In_Java {
	
	Integer x, y;

	Java_10C_Stream_sorted_In_Java(Integer x, Integer y) {
		
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return this.x + ", " + this.y;
	}
}

class GFG {
	public static void main(String[] args) {

		List<Java_10C_Stream_sorted_In_Java> aList = new ArrayList<>();
		aList.add(new Java_10C_Stream_sorted_In_Java(10, 20));
		aList.add(new Java_10C_Stream_sorted_In_Java(5, 10));
		aList.add(new Java_10C_Stream_sorted_In_Java(1, 100));
		aList.add(new Java_10C_Stream_sorted_In_Java(50, 2000));

		// displaying the stream with elements
		// sorted according to x coordinate
		aList.stream().sorted((p1, p2) -> p1.x.compareTo(p2.x)).forEach(System.out::println);
	}
}
