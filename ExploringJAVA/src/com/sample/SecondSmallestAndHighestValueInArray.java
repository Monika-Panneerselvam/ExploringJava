package com.sample;

import java.util.Arrays;
import java.util.Comparator;

public class SecondSmallestAndHighestValueInArray {

	public static void main(String[] args) {
		int[] num = { 1, 1, 4, 5, 2, 2, 6, 6 };
		// int[] arrayNull = { 1, 1 };
		getSecondSmallestValueUsingStreams(num);
		getSecondHighestValueUsingStreams(num);
		// getSecondSmallestValue(arrayNull);
		System.out.println("Second Highest Element Without Stream: " + findSecondHighestValueWithoutStreams(num));
	}

	static void getSecondSmallestValueUsingStreams(int[] arr) {
		int secondSmallestElement = Arrays.stream(arr).distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Value is Empty"));
		System.out.println("Second Smallest Element Using Streams: " + secondSmallestElement);
	}

	static void getSecondHighestValueUsingStreams(int[] arr) {
		int secondHighestElement = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().orElseThrow(() -> new IllegalArgumentException("Value is Empty"));
		System.out.println("Second Highest Element Using Streams: " + secondHighestElement);
	}

	static int findSecondHighestValueWithoutStreams(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

}
