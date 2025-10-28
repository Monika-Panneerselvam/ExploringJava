package com.sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {

	public static void main(String[] args) {
		List<Employ> emp = new ArrayList<Employ>();
		emp.add(new Employ(1, "Alice", "IT", 10000, LocalDate.of(2021, 1, 1)));
		emp.add(new Employ(2, "Bharath", "HR", 15000, LocalDate.of(2021, 12, 1)));
		emp.add(new Employ(3, "Akshay", "IT", 20000, LocalDate.of(2021, 11, 1)));
		emp.add(new Employ(5, "Colin", "HR", 13000, LocalDate.of(2021, 1, 2)));
		emp.add(new Employ(4, "Aditi", "IT", 16000, LocalDate.of(2021, 1, 3)));
		emp.add(new Employ(6, "Mickey", "IT", 17000, LocalDate.of(2021, 1, 5)));
		emp.add(new Employ(7, "Mickeal", "IT", 17000, LocalDate.of(2021, 1, 5)));
		emp.add(new Employ(8, "Mick", "IT", 17000, LocalDate.of(2021, 1, 5)));
		getMostCommonFirstLetter(emp);
	}

	static void getMostCommonFirstLetter(List<Employ> empList) {

		Optional<Map.Entry<Character, Long>> map = empList.stream().map(e -> e.getName().charAt(0))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue());
		System.out.println("Most Common First Letter from Employee: " + map);

	}

}
