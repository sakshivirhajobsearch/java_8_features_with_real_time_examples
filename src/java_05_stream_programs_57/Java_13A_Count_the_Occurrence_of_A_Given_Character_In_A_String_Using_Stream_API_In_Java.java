package java_05_stream_programs_57;

public class Java_13A_Count_the_Occurrence_of_A_Given_Character_In_A_String_Using_Stream_API_In_Java {

	// Method that returns the count of the given
	// character in the string
	public static long count(String s, char ch) {

		return s.chars().filter(c -> c == ch).count();
	}

	// Driver method
	public static void main(String args[]) {
		String str = "geeksforgeeks";
		char c = 'e';
		System.out.println(count(str, c));
	}
}
