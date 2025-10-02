package com.sample;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfEachCharacterInString {

	public static void main(String[] args) {
		String input = "iloveexploringjava";
		int[] arr = { 1, 1, 2, 2, 3, 3, 3, 4, 4, 5 };
		getCountOfEachElementsFromString(input);
		getCountOfEachElementsInIntOfArray(arr);

	}

	static void getCountOfEachElementsFromString(String input) {
		Map<String, Long> map = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("CountOfEachElementsFromString " + map);
	}

	static void getCountOfEachElementsInIntOfArray(int[] arr) {
		Map<Integer, Long> countOfEachElementsInArray = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("countOfEachElementsInArray: " + countOfEachElementsInArray);
	}

}