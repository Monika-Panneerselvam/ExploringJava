package com.sample;

import java.util.Arrays;

public class FristAndLastOccuranceOfParticularValueFromArray {

	public static void main(String[] args) {
		GetValue getValue = new GetValue();
		int[] arr = { 12, 12, 12, 13, 14, 17, 66, 77 };
		getValue.getFristAndLastOccuranceOfParticularValueFromArray(arr, 12);
	}
}

class GetValue {
	public void getFristAndLastOccuranceOfParticularValueFromArray(int[] arr, int target) {
		int x = lower(arr, target);
		int y = upper(arr, target);
		int[] z = new int[] { x, y };
		System.out.println("First & Last Occurance of " + target + " is " + Arrays.toString(z));
	}

	public int lower(int[] nums, int target) {
		int n = nums.length;
		int l = 0, h = n - 1, f = -1;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (nums[mid] == target) {
				f = mid;
				h = mid - 1;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return f;
	}

	public int upper(int[] nums, int target) {
		int n = nums.length;
		int l = 0, h = n - 1, s = -1;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (nums[mid] == target) {
				s = mid;
				l = mid + 1;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return s;
	}
}
