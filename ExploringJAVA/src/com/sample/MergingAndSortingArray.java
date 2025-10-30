package com.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

class CombiningArray {
	public void getMergedArrayByArrayCopyMethod(int[] nums1, int[] nums2) {
		int a = nums1.length;
		int b = nums2.length;
		int c = a + b;
		int[] carray = new int[c];
		System.arraycopy(nums1, 0, carray, 0, a);
		System.arraycopy(nums2, 0, carray, a, b);
		Arrays.sort(carray);
		System.out.println("Merged Array By ArrayCopy & Sort Method:" + Arrays.toString(carray));
	}

	public void getMergedArrayByUsingIndex(int[] nums1, int[] nums2) {
		int[] mergedArray = new int[nums1.length + nums2.length];
		int index = 0;
		for (int element : nums1) {
			mergedArray[index++] = element;
		}
		for (int element : nums2) {
			mergedArray[index++] = element;
		}
		for (int i = 0; i < mergedArray.length; i++) {
			for (int j = i + 1; j < mergedArray.length; j++) {
				int tmp = 0;
				if (mergedArray[i] > mergedArray[j]) {
					tmp = mergedArray[i];
					mergedArray[i] = mergedArray[j];
					mergedArray[j] = tmp;
				}
			}
		}
		System.out.println("Merged and Sorted Array in Traditional Way:" + Arrays.toString(mergedArray));
	}

	public void getMergedArrayByUsingStream(int[] nums1, int[] nums2) {
		int[] merged = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
		System.out.println("Merged and Sorted Array Using streams:" + Arrays.toString(merged));
	}

	public void getMergedArrayByUsingStreamWithoutDuplicates(int[] nums1, int[] nums2) {
		int[] merged = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().distinct().toArray();
		System.out.println("Merged and Sorted Array Using streams without Duplicates:" + Arrays.toString(merged));
	}
}

public class MergingAndSortingArray {

	public static void main(String[] args) {
		CombiningArray combiningArray = new CombiningArray();
		int[] arr1 = { 2, 1, 7, 4 };
		int[] arr2 = { 5, 9, 1, 10 };
		combiningArray.getMergedArrayByArrayCopyMethod(arr1, arr2);
		combiningArray.getMergedArrayByUsingIndex(arr1, arr2);
		combiningArray.getMergedArrayByUsingStream(arr1, arr2);
		combiningArray.getMergedArrayByUsingStreamWithoutDuplicates(arr1, arr2);
	}

}
