package com.sample;

import java.util.List;

public class SumOfFirstTwoNumbersFromArray {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 5, 8, 9);
		getSumOfFirstTwoNumbersFromListOfInteger(list);
		getSumOfAllNumbersFromListOfInteger(list);
	}

	static void getSumOfFirstTwoNumbersFromListOfInteger(List<Integer> list) {
		int sum = list.stream().limit(2).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of 1st two Integers: " + sum);
	}

	static void getSumOfAllNumbersFromListOfInteger(List<Integer> list) {
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all Integers: " + sum);
	}

}
