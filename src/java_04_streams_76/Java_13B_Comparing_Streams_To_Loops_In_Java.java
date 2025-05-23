package java_04_streams_76;

// Java Program to Comparing Streams to Loops

// Importing utility packages
import java.util.ArrayList;
import java.util.List;

// Class 1
// helper class 
class ProgrammingLanguage {

	// Member variables of this class
	int rank;
	String name;
	int value;

	// Member method of this class
	public ProgrammingLanguage(int rank, String name, int value) {

		// this keyword is used to refer current object
		// itself
		this.rank = rank;
		this.name = name;
		this.value = value;
	}
}

// Class 2
// JavaStreamExample
class Java_13C_Comparing_Streams_To_Loops_In_Java {

	public static void main(String[] args) {

		// Creating an object of List class
		// Declaring object of user defined type (above
		// class)
		List<ProgrammingLanguage> programmingLanguage = new ArrayList<ProgrammingLanguage>();

		// Adding elements to the object of this class
		// Custom input entries
		programmingLanguage.add(new ProgrammingLanguage(1, "Java", 7000));
		programmingLanguage.add(new ProgrammingLanguage(2, "Rust", 2000));
		programmingLanguage.add(new ProgrammingLanguage(3, "Ruby", 1500));
		programmingLanguage.add(new ProgrammingLanguage(4, "Scala", 2500));
		programmingLanguage.add(new ProgrammingLanguage(5, "Groovy", 4000));

		// Creating object of List class of integer type
		List<Integer> languageValueList = new ArrayList<Integer>();

		// For each loops for iteration
		for (ProgrammingLanguage language : programmingLanguage) {

			// Filtering data of List
			if (language.value < 3000) {

				// Adding price to above elements
				languageValueList.add(language.value);
			}
		}

		// Print and display all elements inside the object
		System.out.println(languageValueList);
	}
}