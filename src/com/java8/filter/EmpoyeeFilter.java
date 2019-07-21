package com.java8.filter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.comparator.Employee;
import com.java8.comparator.EmployeeSortingUtil;

public class EmpoyeeFilter {

	private EmpoyeeFilter() {
	}

	public static List<Employee> employeeAgeAboveThirty(List<Employee> empl) {

		List<Employee> aboveThrityEmpoyees = empl.stream().filter(e -> e.getAge() >= 30).collect(Collectors.toList());
		
		aboveThrityEmpoyees.forEach(System.out::println);

		return aboveThrityEmpoyees;
	}

	public static Optional<Employee> findEmployee(List<Employee> empList, String name) {
		
		boolean allMatch = empList.stream().allMatch(e->e.getEmpId() >100);
		System.out.println("all empid are above 100 "+allMatch);

		return empList.stream().filter(e -> e.getFirstName().equalsIgnoreCase(name)).findAny();

	}

	public static void main(String[] args) {

		employeeAgeAboveThirty(EmployeeSortingUtil.getEmployeeList());

		findEmployee(EmployeeSortingUtil.getEmployeeList(), "sachin").ifPresent(System.out::println);

	}

}
