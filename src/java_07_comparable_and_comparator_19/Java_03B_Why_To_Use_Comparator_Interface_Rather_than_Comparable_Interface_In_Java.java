package java_07_comparable_and_comparator_19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Java_03B_Why_To_Use_Comparator_Interface_Rather_than_Comparable_Interface_In_Java {

	private void addListElements(ArrayList<Recruitment> list) {
		// Adding entries in above List
		// using add() method
		list.add(new Recruitment("abc consultants", "Rachel", "Analyst", 100000.0, true));
		list.add(new Recruitment("nyc consultants", "Monica", "DBA", 90000.0, true));
		list.add(new Recruitment("abc consultants", "Phoebe", "Programmer", 70000.0, true));
		list.add(new Recruitment("nj consultants", "Jane", "Programmer", 80000.0, false));

		list.add(new Recruitment("xyz consultants", "Ross", "ProgramManager", 200000.0, true));
		list.add(new Recruitment("chennai consultants", "Chandler", "ProjectManager", 150000.0, true));
		list.add(new Recruitment("xyz consultants", "Joe", "Programmer", 80000.0, true));
		list.add(new Recruitment("mumbai consultants", "Any", "Programmer", 85000.0, false));
	}

	@DisplayName("Test check whether sorting done by company name ")
	@Test
	public void testSortByCompanyName() {
		// Creating an empty ArrayList of Recruitment type
		ArrayList<Recruitment> list = new ArrayList<Recruitment>();

		addListElements(list);

		// Sorting the entries by company name
		Collections.sort(list, new GetDataByCompanyName());

		// Assert the data for sorting by company name
		assertEquals(true, list.get(0).getCompanyName().equalsIgnoreCase("abc consultants"));
		assertEquals(true, list.get(1).getEmployeeName().equalsIgnoreCase("Phoebe"));
		assertEquals(true, list.get(2).getDesignation().equalsIgnoreCase("ProjectManager"));

		assertTrue(list.get(0).getEmployeeName().equalsIgnoreCase("Rachel"));
		assertTrue(list.get(list.size() - 1).getCompanyName().equalsIgnoreCase("xyz consultants"));
		assertTrue(list.get(list.size() - 1).getDesignation().equalsIgnoreCase("Programmer"));

	}

	@DisplayName("Test check whether sorting done by salary ")
	@Test
	public void testSortBySalary() {
		// Creating an empty ArrayList of Recruitment type
		ArrayList<Recruitment> list = new ArrayList<Recruitment>();

		addListElements(list);

		// Sorting the entries by company name
		Collections.sort(list, new GetDataBySalary());

		// Assert the data for sorting by company name
		assertEquals(true, list.get(0).getCompanyName().equalsIgnoreCase("abc consultants"));
		assertEquals(true, list.get(1).getCompanyName().equalsIgnoreCase("nj consultants"));
		assertEquals(true, list.get(2).getSalary() == 80000.0);

		assertTrue(list.get(0).getEmployeeName().equalsIgnoreCase("Phoebe"));
		assertTrue(list.get(list.size() - 1).getCompanyName().equalsIgnoreCase("xyz consultants"));
		assertTrue(list.get(list.size() - 1).getDesignation().equalsIgnoreCase("ProgramManager"));
		assertTrue(list.get(0).getSalary() == 70000.0);
		assertTrue(list.get(list.size() - 1).getSalary() == 200000.0);

	}

	@DisplayName("Test check whether sorting done by designation ")
	@Test
	public void testSortByDesignation() {
		// Creating an empty ArrayList of Recruitment type
		ArrayList<Recruitment> list = new ArrayList<Recruitment>();

		addListElements(list);

		// Sorting the entries by Designation
		Collections.sort(list, new GetDataByDesignation());

		// Assert the data for sorting by company name
		assertEquals(true, list.get(0).getCompanyName().equalsIgnoreCase("abc consultants"));
		assertEquals(true, list.get(1).getCompanyName().equalsIgnoreCase("nyc consultants"));
		assertEquals(true, list.get(2).getSalary() == 200000.0);

		assertTrue(list.get(0).getEmployeeName().equalsIgnoreCase("Rachel"));
		assertTrue(list.get(list.size() - 1).getCompanyName().equalsIgnoreCase("chennai consultants"));
		assertTrue(list.get(list.size() - 1).getDesignation().equalsIgnoreCase("ProjectManager"));
		assertTrue(list.get(0).getSalary() == 100000.0);
		assertTrue(list.get(list.size() - 1).getSalary() == 150000.0);

	}

	@DisplayName("Test check whether sorting done both designation and salary ")
	@Test
	public void testSortByBothDesignationAndSalary() {
		// Creating an empty ArrayList of Recruitment type
		ArrayList<Recruitment> list = new ArrayList<Recruitment>();

		addListElements(list);

		// Sorting the entries by designation and salary
		Collections.sort(list, new GetDataByDesignationAndSalary());

		// Assert the data for sorting by designation and salary
		assertEquals(true, list.get(0).getCompanyName().equalsIgnoreCase("abc consultants"));
		assertEquals(true, list.get(1).getCompanyName().equalsIgnoreCase("nj consultants"));
		assertEquals(true, list.get(2).getSalary() == 80000.0);

		assertTrue(list.get(0).getEmployeeName().equalsIgnoreCase("Phoebe"));
		assertTrue(list.get(list.size() - 2).getCompanyName().equalsIgnoreCase("chennai consultants"));
		assertTrue(list.get(list.size() - 2).getDesignation().equalsIgnoreCase("ProjectManager"));
		assertTrue(list.get(3).getSalary() == 85000.0);
		assertTrue(list.get(list.size() - 1).getSalary() == 200000.0);
		assertTrue(list.get(list.size() - 1).getDesignation().equalsIgnoreCase("ProgramManager"));
	}
}
