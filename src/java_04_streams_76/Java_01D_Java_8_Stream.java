package java_04_streams_76;

//Java Program to demonstrate
//File Write Operation
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Driver Class
public class Java_01D_Java_8_Stream {

	// main function
	public static void main(String[] args) {
		String[] words = { "Geeks", "for", "Geeks", "Hello", "World" };

		// Replace with the
		// actual file path

		String fileName = "path/to/your/file.txt";

		// Step 1: Create a PrintWriter to write to the
		// file
		try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {

			// Step 2: Use Stream to write each word to the
			// file
			Stream.of(words).forEach(pw::println);

			// Step 3: Print success message to the console
			System.out.println("Words written to the file successfully.");
		} catch (IOException e) {
			// Step 4: Handle any IO exception that occurs
			// during the file writing process
			e.printStackTrace();
		}
	}
}
