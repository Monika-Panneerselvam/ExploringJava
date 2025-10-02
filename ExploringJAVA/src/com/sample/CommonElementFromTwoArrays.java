package com.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementFromTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 6, 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 2, 4, 3 };
		getCommonElementFromTwoArrays(arr1, arr2);
		getCommonElementFromTwoArraysWithoutStreams(arr1, arr2);
	}

	static void getCommonElementFromTwoArrays(int[] a, int[] b) {
		List<Integer> commonElements = Arrays.stream(a).filter(anum -> Arrays.stream(b).anyMatch(bnum -> bnum == anum))
				.boxed().collect(Collectors.toList());
		System.out.println("Common Elements using Streams:" + commonElements);
	}

	static void getCommonElementFromTwoArraysWithoutStreams(int[] a, int[] b) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> commonSet = new HashSet<>();

		for (int num : a) {
			set.add(num);
		}

		for (int num : b) {
			if (set.contains(num)) {
				commonSet.add(num);
			}
		}
		System.out.println("Common Elements without Streams: " + commonSet);
	}

}
