package java_10_miscellaneous_74;

import java.util.ArrayList;

//Simple Java program to see the jdeps
//generated output with various options

import java.util.List;

class Java_07A_Java_class_dependency_analyzer_In_Java_8 {

	public static void main(String args[]) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();

		list1.add("Geeks");
		list2.add("for");
		list3.add("geeks");

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}