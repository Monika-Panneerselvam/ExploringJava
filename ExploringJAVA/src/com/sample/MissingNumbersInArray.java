package com.sample;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		Integer nums[] = { 1, 4, 6, 3, 7 };
		getMissingNumbersInArray(nums);
	}

	static void getMissingNumbersInArray(Integer[] nums) {
		Arrays.sort(nums);
		Integer max = nums[nums.length - 1];
		HashSet<Integer> set = new HashSet<>(Arrays.asList(nums));
		for (int i = 0; i < max + 1; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
