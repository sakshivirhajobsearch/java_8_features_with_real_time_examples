package java_05_stream_programs_57;

//Java program to convert User[]
//into Map<city, countOfUser>

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Implementing the user class
public class Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java {

	// Parameters of the user class
	private int userId;
	private String name;
	private String city;

	// Constructor
	public Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java(int userId, String name, String city) {
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

class Java_09D1_How_To_Convert_A_Stream_into_A_Map_In_Java {

	public static Map toMap(Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user1,
			Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user2,
			Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user3,
			Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user4,
			Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user5) {

		Map<String, Long> cityUserCountMap = Arrays.asList(user1, user2, user3, user4, user5).stream()
				.collect(Collectors.groupingBy(Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java::getCity,
						Collectors.counting()));

		return cityUserCountMap;
	}

	public static void main(String[] args) {

		// Creating new users
		Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user1 = new Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java(
				1, "User1", "Pune");
		Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user2 = new Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java(
				2, "User2", "Mumbai");
		Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user3 = new Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java(
				3, "User3", "Nagpur");
		Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user4 = new Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java(
				4, "User4", "Pune");
		Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java user5 = new Java_09D_How_To_Convert_A_Stream_into_A_Map_In_Java(
				5, "User5", "Mumbai");

		System.out.println(toMap(user1, user2, user3, user4, user5));
	}
}
