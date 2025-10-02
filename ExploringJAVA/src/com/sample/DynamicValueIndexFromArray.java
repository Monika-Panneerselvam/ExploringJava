package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicValueIndexFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		getIndexOfDynamicValueFromArrayUsingLinearSeacrh(arr, 9);
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8, 9, 10 };
		getFristAndLastOccuranceIndexOfDynamicValueFromArrayUsingLinearSearch(a, 7);
		System.out.println("Is given element present: " + dynamicValueFromArrayIsPresent(a, 10));
		System.out.println("Index of given element: "
				+ getIndexOfDynamicValueFromArrayUsingBinarySearch(arr, arr[0], arr[arr.length - 1], 8));
	}

	static void getIndexOfDynamicValueFromArrayUsingLinearSeacrh(int[] arr, int k) {
		if (Arrays.stream(arr).anyMatch(a -> a == k)) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == k) {
					System.out.println("Index of " + k + " is " + i);
				}
			}
		} else {
			System.out.println("Given value " + k + " is not present");
		}
	}

	static void getFristAndLastOccuranceIndexOfDynamicValueFromArrayUsingLinearSearch(int[] arr, int k) {
		List<Integer> arrList = new ArrayList<>();
		if (Arrays.stream(arr).anyMatch(a -> a == k)) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == k) {
					arrList.add(i);
				}
			}
			System.out.println("Frist occurance of " + k + " is " + arrList.get(0));
			System.out.println("Last Occurance of " + k + " is " + arrList.get(arrList.size() - 1));
		} else {
			System.out.println("Given value " + k + " is not present");
		}
	}

	static boolean dynamicValueFromArrayIsPresent(int[] arr, int k) {
		if (Arrays.stream(arr).anyMatch(a -> a == k)) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == k) {
					return true;
				}
			}
		}
		return false;
	}

	static int getIndexOfDynamicValueFromArrayUsingBinarySearch(int arr[], int low, int high, int key) {
		int mid = (low + high) / 2;

		while (low <= high) {
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}

		if (low > high) {
			return -1;
		}

		return -1;
	}
}
