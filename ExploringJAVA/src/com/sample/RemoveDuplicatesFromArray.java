package com.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] a = { 2, 5, 3, 6, 8, 2, 5, 4 };
		getRemoveDuplicatesFromArray(a);
	}

	static void getRemoveDuplicatesFromArray(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		int[] uniqueArray = new int[set.size()];
		int i = 0;
		for (int num : set) {
			uniqueArray[i] = num;
			i++;
		}
		System.out.println("Removed Duplicates from Given Array: " + Arrays.toString(uniqueArray));
		System.out.println("Removed Duplicates from Given Array: " + set);

		System.out.println("Removed Duplicates from Given Array using Streams: "
				+ Arrays.stream(arr).distinct().sorted().boxed().collect(Collectors.toList()));
	}

}
