package com.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversingArrayInPlace {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 8, 9 };
		getReversingArrayInPlace(a);
	}

	static void getReversingArrayInPlace(int[] arr) {
		IntStream.range(0, arr.length / 2).forEach(i -> {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		});
		System.out.println("Reversing Array In Place:" + Arrays.toString(arr));

	}

}
