package com.sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employ {
	int id;
	String name;
	String department;
	int salary;
	LocalDate joiningDate;

	public Employ(int id, String name, String department, int salary, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", joiningDate=" + joiningDate + "]";
	}

}

public class StreamAPIUsingEmployee {

	public static void main(String[] args) {

		List<Employ> emp = new ArrayList<Employ>();
		emp.add(new Employ(1, "Alice", "IT", 10000, LocalDate.of(2021, 1, 1)));
		emp.add(new Employ(2, "Alaya", "HR", 15000, LocalDate.of(2021, 12, 1)));
		emp.add(new Employ(3, "Akshay", "IT", 20000, LocalDate.of(2021, 11, 1)));
		emp.add(new Employ(5, "Abi", "HR", 13000, LocalDate.of(2021, 1, 2)));
		emp.add(new Employ(4, "Aditi", "IT", 16000, LocalDate.of(2021, 1, 3)));
		emp.add(new Employ(6, "Aura", "IT", 17000, LocalDate.of(2021, 1, 5)));

		// Filter emp who joined after specific date and specific department
		LocalDate filterDate = LocalDate.of(2021, 1, 1);
		String filterDept = "IT";
		List<Employ> filteredEmpBasedOnJoinDateAndDepartment = emp.stream()
				.filter(e -> e.getJoiningDate().isAfter(filterDate) && e.getDepartment().equals(filterDept)).toList();
		System.out.println("Filtered Employee (joined after " + filterDate + " in Department " + filterDept + "): ");
		filteredEmpBasedOnJoinDateAndDepartment.forEach(System.out::println);

		// Group emp by Department & calculate avg salary
		Map<String, Double> avgSalaryByDept = emp.stream()
				.collect(Collectors.groupingBy(Employ::getDepartment, Collectors.averagingDouble(Employ::getSalary)));
		System.out.println("\nAverage Salary by Department: ");
		avgSalaryByDept.forEach((dept, avgSal) -> System.out.println(dept + " -> " + avgSal));

		// Sort employee by salary in descending order & collect top 3 highest paid
		List<Employ> top3HighestPaid = emp.stream().sorted(Comparator.comparingDouble(Employ::getSalary).reversed())
				.limit(3).toList();
		System.out.println("\nTop 3 Highest Paid Employees: ");
		top3HighestPaid.forEach(System.out::println);

		// Convert list of Emp into map with id as key and Employee as value
		Map<Integer, Employ> employMap = emp.stream().collect(Collectors.toMap(Employ::getId, e -> e));
		System.out.println("\nEmployee Map (id ->  Employee): ");
		employMap.forEach((id, e) -> System.out.println(id + " -> " + e));

		// Group By Departments & departments should be ascending order
		Map<String, List<Employ>> collect = emp.stream()
				.collect(Collectors.groupingBy(Employ::getDepartment, TreeMap::new, Collectors.toList()));
		collect.forEach((k, v) -> System.out.println(k + " -> " + v));

		// Highest paid employ per department
		Map<String, Optional<Employ>> highestPaidByDept = emp.stream().collect(Collectors
				.groupingBy(Employ::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employ::getSalary))));
		System.out.println("Highest paid by Department: ");
		highestPaidByDept.forEach((dept, e) -> System.out.println(dept + " -> " + e.orElse(null)));

	}

}
