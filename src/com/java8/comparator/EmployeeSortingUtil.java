package com.java8.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortingUtil {

	private EmployeeSortingUtil() {
	}

	public static List<Employee> getEmployeeList() {
		return Arrays.asList(new Employee(101, "Mahindra singh", "Dhoni", 38, 58000),
				new Employee(134, "Virat", "Kholi", 30, 54200), new Employee(181, "Hardik", "Pandya", 25, 42500));
	}

	public static void empLastNameSortingUsingLambda(List<Employee> employeeList) {

		employeeList.stream().sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
				.forEach(System.out::println);
	}

	public static void empAgeSortingWithoutLambda(List<Employee> employeeList) {
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getAge() == emp2.getAge() ? 0 : emp1.getAge() < emp2.getAge() ? -1 : 1;
			}
		});
		employeeList.forEach(System.out::println);
	}

	public static void main(String[] args) {

		// sort without lambda
		empAgeSortingWithoutLambda(getEmployeeList());

		System.out.println("------------------ First Name sorting using Lamda experssion ---------------");

		// sort with Lambda
		empLastNameSortingUsingLambda(getEmployeeList());

	}

}
