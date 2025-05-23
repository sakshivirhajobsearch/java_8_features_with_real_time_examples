package java_05_stream_programs_57;

//Program to convert User[] into
//Map<userId, User>

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Implementing the User class
public class Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java {

	// Attributes of the user class
	private int userId;
	private String name;
	private String city;

	// Constructor
	public Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java(int userId, String name, String city) {
		this.userId = userId;
		this.name = name;
		this.city = city;
	}

	// Getters of the user class
	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	// Overriding the toString method
	// to return the custom string
	@Override
	public String toString() {
		return "User [userId = " + userId + ", name = " + name + ", city = " + city + "]";
	}
}

class GFG {

	// Function to convert the User
	// to the map
	public static Map toMap(Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java user1,
			Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java user2,
			Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java user3) {

		Map<Integer, Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java> userMap = Arrays.asList(user1, user2, user3)
				.stream().collect(Collectors.toMap(user -> user.getUserId(), user -> user));

		return userMap;
	}

	// Driver code
	public static void main(String[] args) {

		// Creating users
		Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java user1 = new Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java(
				1, "User1", "Pune");

		Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java user2 = new Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java(
				2, "User2", "Mumbai");

		Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java user3 = new Java_09B_How_To_Convert_A_Stream_into_A_Map_In_Java(
				3, "User3", "Nagpur");

		System.out.println(toMap(user1, user2, user3));
	}
}
