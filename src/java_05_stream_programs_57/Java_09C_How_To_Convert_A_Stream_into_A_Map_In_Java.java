package java_05_stream_programs_57;

//Java program to convert the User[]
//into Map<city, List<User>>

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Implementing the User class
public class Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java {

	// Parameters of the user class
	private int userId;
	private String name;
	private String city;

	// Constructor of the User class
	public Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java(int userId, String name, String city) {
		this.userId = userId;
		this.name = name;
		this.city = city;
	}

	// Getter functions
	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	// Overriding the toString() method
	// to create a custom function
	@Override
	public String toString() {
		return "User [userId = " + userId + ", name = " + name + ", city = " + city + "]";
	}
}

class Java_09C1_How_To_Convert_A_Stream_into_A_Map_In_Java {

	// Function to convert the user
	// object to the map
	public static Map toMap(Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user1,
			Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user2,
			Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user3,
			Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user4,
			Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user5) {
		Map<String, List<Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java>> cityUserListMap = Arrays
				.asList(user1, user2, user3, user4, user5).stream()
				.collect(Collectors.groupingBy(Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java::getCity));

		return cityUserListMap;
	}

	public static void main(String[] args) {

		// Creating new users
		Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user1 = new Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java(
				1, "User1", "Pune");
		Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user2 = new Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java(
				2, "User2", "Mumbai");
		Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user3 = new Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java(
				3, "User3", "Nagpur");
		Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user4 = new Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java(
				4, "User4", "Pune");
		Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java user5 = new Java_09C_How_To_Convert_A_Stream_into_A_Map_In_Java(
				5, "User5", "Mumbai");

		System.out.println(toMap(user1, user2, user3, user4, user5));
	}
}