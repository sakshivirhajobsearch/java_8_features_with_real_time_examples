package java_05_stream_programs_57;

//Java Program to Convert a String to List of Characters
//Using charAt() in a loop
import java.util.ArrayList;
import java.util.List;

public class Java_22B_Convert_A_String_To_A_List_of_Characters_In_Java {

	public static void main(String[] args) {

		String s = "Java";
		List<Character> ch = new ArrayList<>();

		// Extract each character using charAt() method
		for (int i = 0; i < s.length(); i++) {
			ch.add(s.charAt(i));
		}

		System.out.println(ch);
	}
}
