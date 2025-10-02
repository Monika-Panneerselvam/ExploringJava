package com.sample;

import java.util.Arrays;

public class MedianOfTwoArrays {

	public static void main(String[] args) {

		int[] a = { 11, 9, 3, -4, 5, 9 };
		int[] b = { 6, 27, 8, 14, 24 };
		getMedianOfTwoArrays(a, b);
	}

	static void getMedianOfTwoArrays(int[] arr1, int[] arr2) {
		// Merging 2 Arrays
		int a = arr1.length;
		int b = arr2.length;
		int c = a + b;
		int[] arr3 = new int[c];
		System.arraycopy(arr1, 0, arr3, 0, a);
		System.arraycopy(arr2, 0, arr3, a, b);
		Arrays.sort(arr3);
		System.out.println("Merged Array:" + Arrays.toString(arr3));
		// Finding Median of Merged Array
		if (c % 2 == 0) {
			System.out.println("Length of Array is even");
			int x = c / 2;
			int y = arr3[x];
			int z = arr3[x - 1];
			int result = (y + z) / 2;
			System.out.println("Median: " + result);
		} else {
			System.out.println("Length of Array is odd");
			int x = Math.round(c / 2);
			System.out.println("Median: " + arr3[x]);
		}
	}

}
