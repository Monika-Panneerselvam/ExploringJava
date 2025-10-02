package com.sample;

import java.util.Arrays;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 8, 55, 9 };
		sortingArrayWithoutUsingInbuiltMethod(arr);
		sortingArrayUsingSortMethod(arr);
		System.out.println("Smallest Element from Array: " + arr[0]);
		System.out.println("Largest Element from Array: " + arr[arr.length - 1]);
	}

	static void sortingArrayWithoutUsingInbuiltMethod(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	static void sortingArrayUsingSortMethod(int[] a) {
		Arrays.sort(a);
		System.out.println("Sorted Array using Sort Method: " + Arrays.toString(a));
	}
}
