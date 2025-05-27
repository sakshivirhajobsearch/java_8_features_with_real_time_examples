package java_08_optional_class_34;

//Java program with Optional Class

import java.util.Optional;

public class Java_01B_Java_8_Optional_Class {

	// Main Method
	public static void main(String[] args) {
		String[] words = new String[10];

		Optional<String> checkNull = Optional.ofNullable(words[5]);

		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is null");
	}
}