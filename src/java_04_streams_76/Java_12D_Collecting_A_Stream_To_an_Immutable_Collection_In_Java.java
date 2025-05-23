package java_04_streams_76;

//Java Program to illustrate Collecting a Stream to
//an Immutable Collection
//Post java 10
//Using toUnmodifiableMap() method 

//Importing required libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//ImmutableCollectionMap

public class Java_12D_Collecting_A_Stream_To_an_Immutable_Collection_In_Java {

	public static void main(String[] args) {

		List<Books> libInventory = new ArrayList<>();

		libInventory.add(new Books(1, "Pride and Prejudice"));
		libInventory.add(new Books(2, "The Sign of Four"));
		libInventory.add(new Books(3, "Sense and Sensibility"));
		libInventory.add(new Books(4, "Mansfield Park"));
		libInventory.add(new Books(5, "The Materese Circle"));
		libInventory.add(new Books(6, "The Hound of Baskerville"));
		libInventory.add(new Books(7, "Goodnight Moon"));
		libInventory.add(new Books(8, "How many sleeps till my Birthday"));
		libInventory.add(new Books(9, "The Bourne Identity"));
		libInventory.add(new Books(10, "Murder She Wrote"));
		libInventory.add(new Books(11, "The adventures of Hercule Poirot"));
		libInventory.add(new Books(12, "The song of Ice and Fire"));

		Map<Integer, String> unmutableInventory = libInventory.stream()
				.collect(Collectors.toUnmodifiableMap(Books::getId, Books::getName));

		System.out.println(unmutableInventory);

		// This will throw an UnsupportedOperationException
		unmutableInventory.put(13, "Some book");
	}
}

class Books {

	private int id;
	private String name;

	public Books(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
