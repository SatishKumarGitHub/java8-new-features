package com.java8.map;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.comparator.Employee;
import com.java8.comparator.EmployeeSortingUtil;

public class EmployeeMap {

	private static final float HIKE = 0.2f;

	EmployeeMap() {
	}

	public static List<Employee> giveHikeToAllEmployees(List<Employee> empList, float hikePrecentage) {

		return empList.stream().map(e -> {
			Employee emp = e;
			double hike = e.getSalary() * hikePrecentage;
			emp.setSalary(e.getSalary() + hike);
			return emp;
		}).collect(Collectors.toList());

	}

	public static double totalCtcAtfterHike(List<Employee> empList, float hikePrecentage) {
		return empList.stream().map(e -> e.getSalary() + (e.getSalary() * hikePrecentage))
				.mapToDouble(sal-> sal.doubleValue()).sum();
	}

	public static void main(String[] args) {

		System.out.println("Before Apprisal");
		EmployeeSortingUtil.getEmployeeList().forEach(System.out::println);
		System.out.println("after Apprisal");
		giveHikeToAllEmployees(EmployeeSortingUtil.getEmployeeList(), HIKE).forEach(System.out::println);
/*
		System.out.println("orginal array after increment");
		EmployeeSortingUtil.getEmployeeList().forEach(System.out::println);*/

		double totalCtcAtfterHike = totalCtcAtfterHike(EmployeeSortingUtil.getEmployeeList(), HIKE);
		System.out.println("Cost to company after hike " + totalCtcAtfterHike);

	}

}
