package com.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversingArrayInPlace {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 8, 9, 10 };
		getReversingArrayInPlace(a);
		getReversingArrayInPlaceUsingRangeClosed(a);
	}

	static void getReversingArrayInPlace(int[] arr) {
		IntStream.range(0, arr.length / 2).forEach(i -> {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		});
		System.out.println("Reversing Array In Place:" + Arrays.toString(arr));

	}

	static void getReversingArrayInPlaceUsingRangeClosed(int[] arr) {
		IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
		System.out.println("Reversing Array In Place Using rangeClosed:" + Arrays.toString(arr));
	}

}
