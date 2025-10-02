package com.sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DynamicNthHighestSalary {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("AAA", 150);
		map.put("BBB", 500);
		map.put("CCC", 150);
		map.put("WWW", 600);
		map.put("XXX", 500);
		System.out.println("Nth Highest Salary: " +getDynamicNthHighestSalary(2, map));
	}

	public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int n, Map<String, Integer> map) {

		System.out.println("List of employee based on same salary: " +map.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList()))));
		return map.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList()).get(n - 1);
	}

}
