package com.sample;

import java.util.Arrays;
import java.util.Random;

class Resolution {

	public void findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		int kthLargestElement = nums[nums.length - k];
		System.out.println("Kth Largest Element from the array:" + kthLargestElement);
	}

	public static int quickSelect(int[] nums, int left, int right, int kLargest) {
		if (left == right)
			return nums[left];

		Random rand = new Random();
		int pivotIndex = left + rand.nextInt(right - left);

		pivotIndex = partition(nums, left, right, pivotIndex);

		if (kLargest == pivotIndex) {
			return nums[kLargest];
		} else if (kLargest < pivotIndex) {
			return quickSelect(nums, left, pivotIndex - 1, kLargest);
		} else {
			return quickSelect(nums, pivotIndex + 1, right, kLargest);
		}
	}

	private static int partition(int[] nums, int left, int right, int pivotIndex) {
		int pivotValue = nums[pivotIndex];
		swap(nums, pivotIndex, right);
		int storeIndex = left;

		for (int i = left; i < right; i++) {
			if (nums[i] < pivotValue) {
				swap(nums, storeIndex, i);
				storeIndex++;
			}
		}
		swap(nums, right, storeIndex);
		return storeIndex;
	}

	private static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}

public class FindKthLargestArray {

	public static void main(String[] args) {
		Resolution s = new Resolution();
		int[] arr = { 3, 2, 1, 5, 6, 4, 5 };
		int k = 3;
		s.findKthLargest(arr, k);
		System.out.println(
				"kth Largets Value Using QuickSelect: " + s.quickSelect(arr, 0, arr.length - 1, arr.length - k));
	}

}
