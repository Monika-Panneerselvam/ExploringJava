package com.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int Salary;
	String name;

	public Employee(int Salary, String name) {
		super();
		this.name = name;
		this.Salary = Salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Name= " + name + " , Salary= " + Salary + "]";
	}

}

public class SortingEmployeeArrayBasedOnSalary {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10, "AAA"));
		emp.add(new Employee(50, "BBB"));
		emp.add(new Employee(20, "CCC"));
		emp.add(new Employee(70, "DDD"));

		List<Employee> sortedEmployeeList = emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedEmployeeList);
	}

}
