package com.sample;

public class NumberOfOddAndEvenValuesInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		getNumberOfOddAndEvenValuesInArray(arr);
	}

	static void getNumberOfOddAndEvenValuesInArray(int[] arr) {
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number Of Odd Values: " + oddCount + " & Even Values: " + evenCount);
	}

}
