package com.java8.foreach;

import java.util.HashMap;
import java.util.Map;

import com.java8.comparator.Employee;

public class ForEachUtil {

	private ForEachUtil() {
	}

	public static Map<String, Employee> getDepartmentWiseEmployee() {

		Map<String, Employee> empMap = new HashMap<>();

		empMap.put("Developer", new Employee(13, "Mahindra singh", "Dhoni", 38, 58000));
		empMap.put("QA", new Employee(16, "Virat", "Kholi", 30, 52500));
		empMap.put("DBA", new Employee(13, "Hardik", "Pandya", 25, 48000));

		return empMap;
	}

	public static void iterateMapUsingForEach(Map<String, Employee> empMap) {

		empMap.forEach((str, emp) -> System.out.println("Departemt " + str + " Name " + emp.getFirstName()));
	}

	public static void main(String[] args) {

		iterateMapUsingForEach(getDepartmentWiseEmployee());

	}

}