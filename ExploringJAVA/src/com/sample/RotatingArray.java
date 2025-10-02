package com.sample;

import java.util.Arrays;

public class RotatingArray {

	public static void main(String[] args) {
		int[] num = { 1, 7, 8, 4, 5, 2, 9 };
		rotate(num, 4);
	}

	static void rotate(int[] arr, int order) {
		System.out.println("Original Array:" + Arrays.toString(arr));
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		System.out.println("Rotated Array:" + Arrays.toString(arr));
	}

}
