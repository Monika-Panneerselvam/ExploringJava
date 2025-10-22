package com.sample;

import java.util.ArrayList;
import java.util.List;

public class IncreasingDigitInNumberFromIntArray {

	public static void main(String[] args) {

		int[] num = { 123, 321, 456, 656, 789 };
		List<Integer> result = new ArrayList<>();
		for (int n : num) {
			if (isIncreasingDigitNumber(n))
				result.add(n);
		}
		System.out.println(result);
	}

	static boolean isIncreasingDigitNumber(int num) {
		int prevDigit = 10;
		while (num > 0) {
			int currentDigit = num % 10;
			if (currentDigit >= prevDigit)
				return false;
			prevDigit = currentDigit;
			num /= 10;
		}
		return true;
	}

}
