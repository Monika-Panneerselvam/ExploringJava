package com.sample;

class Solution {

	public void merger(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = n + m - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
				k--;
			} else {
				nums1[k] = nums1[j];
				j--;
				k--;
			}
		}

		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	}
}

public class TwoArrayIncreasingOrder {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 7 };
		solution.merger(arr1, 2, arr2, 1);

	}

}
