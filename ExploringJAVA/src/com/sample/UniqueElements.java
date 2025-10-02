package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElements {

	public static void main(String[] args) {
		String input = "iloveexploringjava";
		int[] arr = { 2, 2, 3, 4, 5, 5, 6 };

		List<String> uniqueelementsInString = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Unique Elements In String:" + uniqueelementsInString);

		List<Integer> uniqueElemetsInArray = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Unique Elements In Array:" + uniqueElemetsInArray);
	}

}
