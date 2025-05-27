package java_07_comparable_and_comparator_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java {
	
	public Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java(String companyName, String employeeName, String designation, double salary, boolean status) {
		
		super();
		this.companyName = companyName;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
		this.status = status;
	}

	public Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java() {
		// via setter methods, rest fields are done
	}

	String companyName;
	String designation;
	String employeeName;
	double salary;
	boolean status;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Method of Recruitment class
	// To print Recruitment details in main()
	public String toString() {

		// Returning attributes of Recruitment
		return this.companyName + " " + this.employeeName + " " + this.designation + " " + this.salary + " "
				+ this.status;
	}

	public static void main(String args[]) {
		// Creating an empty ArrayList of Student type
		ArrayList<Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java> list = new ArrayList<Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java>();

		// Adding entries in above List
		// using add() method
		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("abc consultants", "Rachel", "Analyst", 100000.0, true));
		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("nyc consultants", "Monica", "DBA", 90000.0, true));
		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("abc consultants", "Phoebe", "Programmer", 70000.0, true));
		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("nj consultants", "Jane", "Programmer", 80000.0, false));

		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("xyz consultants", "Ross", "ProgramManager", 200000.0, true));
		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("chennai consultants", "Chandler", "ProjectManager", 150000.0, true));
		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("xyz consultants", "Joe", "Programmer", 80000.0, true));
		list.add(new Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java("mumbai consultants", "Any", "Programmer", 85000.0, false));

		// Display message on console for better readability
		System.out.println("Unsorted order of the details");

		// Iterating over entries to print them
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		// Sorting the entries by company name
		Collections.sort(list, new GetDataByCompanyName());

		System.out.println("\nSorted by CompanyName");

		// We will get the sorted order now by company name
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		// Sorting the entries by salary
		Collections.sort(list, new GetDataBySalary());

		System.out.println("\nSorted by salary");

		// We will get the sorted order now by salary
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		// Sorting the entries by designation
		Collections.sort(list, new GetDataByDesignation());

		System.out.println("\nSorted by designation");

		// We will get the sorted order now by designation
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		// Sorting the entries by designation and salary
		Collections.sort(list, new GetDataByDesignationAndSalary());

		System.out.println("\nSorted by designation and salary");

		// We will get the sorted order now by salary
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}

class GetDataByCompanyName implements Comparator<Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java> {

	@Override
	public int compare(Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment1, Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment2) {
		return recruitment1.companyName.compareTo(recruitment2.companyName);
	}

}

class GetDataBySalary implements Comparator<Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java> {
	@Override
	public int compare(Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment1, Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment2) {
		return (int) (recruitment1.salary - recruitment2.salary);
	}

}

class GetDataByDesignation implements Comparator<Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java> {
	@Override
	public int compare(Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment1, Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment2) {
		return recruitment1.designation.compareTo(recruitment2.designation);
	}

}

// Using 2 fields to compare
class GetDataByDesignationAndSalary implements Comparator<Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java> {

	@Override
	public int compare(Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment1, Java_03A_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java recruitment2) {
		int designationComparision = recruitment1.designation.compareTo(recruitment2.designation);
		int salaryComparision = (int) (recruitment1.salary - recruitment2.salary);
		return (salaryComparision == 0) ? designationComparision : salaryComparision;
	}

}