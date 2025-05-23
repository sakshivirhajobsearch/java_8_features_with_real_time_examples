package java_05_stream_programs_57;

//Java program to convert a String to a List of Characters 
//using AbstractList
import java.util.AbstractList;
import java.util.List;

class Java_22C_Convert_A_String_To_A_List_of_Characters_In_Java {

	// Function to convert String to List of Characters
	public static List<Character> StringToCharList(String s) {
		return new AbstractList<Character>() {

			// Overriding the get method to retrieve characters from the string
			@Override
			public Character get(int i) {
				return s.charAt(i);
			}

			// Overriding the size method to return the string length
			@Override
			public int size() {
				return s.length();
			}
		};
	}

	public static void main(String[] args) {

		// String to be converted
		String s = "Java";

		// Get the List of Character
		List<Character> ch = StringToCharList(s);

		System.out.println(ch);
	}
}
