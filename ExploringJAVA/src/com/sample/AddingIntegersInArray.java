package com.sample;

import java.util.Arrays;

public class AddingIntegersInArray {

	public static void main(String[] args) {
		String[] arr = { "1", "2", "3", "0", "#", "1" };
		int[] num = { 1, 2, 3, 0, 1, 9 };
		sumOfIntegersInArrayWithStringDataType(arr);
		sumOfIntegersInArrayWithStringDataTypeUsingStreams(arr);
		sumOfIntegersInArrayWithIntDataType(num);
		sumOfIntegersInArrayUsingStreamsWithSumInBuiltFunction(num);
		sumOfIntegersInArrayUsingStreamsWithReduceInBuiltFunction(num);
	}

	static void sumOfIntegersInArrayWithStringDataType(String[] arr) {
		int sum = 0;
		for (String element : arr) {
			try {
				int num = Integer.parseInt(element);
				sum += num;
			} catch (NumberFormatException e) {
				System.out.println("Ignored non-Integer element");
			}
		}
		System.out.println("Sum of Integers from Given String of Array: " + sum);
	}

	static void sumOfIntegersInArrayWithStringDataTypeUsingStreams(String[] arr) {
		System.out.println("Sum of Integers from Given String of Array using streams: "
				+ Arrays.stream(arr).filter(s -> s.matches("-?\\d+")).mapToInt(Integer::parseInt).sum());
	}

	static void sumOfIntegersInArrayWithIntDataType(int[] arr) {
		int sum = 0;

		for (int i : arr)
			sum += i;

		System.out.println("Sum of Integers from Given int of Array: " + sum);
	}

	static void sumOfIntegersInArrayUsingStreamsWithSumInBuiltFunction(int[] arr) {
		System.out.println(
				"Sum of Integers from Given int of Array using Streams with sum(): " + Arrays.stream(arr).sum());
	}

	static void sumOfIntegersInArrayUsingStreamsWithReduceInBuiltFunction(int[] arr) {
		System.out.println("Sum of Integers from Given int of Array using Streams with reduce(): "
				+ Arrays.stream(arr).reduce(0, (a, b) -> a + b));
	}

}
