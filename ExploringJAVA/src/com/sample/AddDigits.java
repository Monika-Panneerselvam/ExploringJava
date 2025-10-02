package com.sample;

import java.util.Arrays;

public class AddDigits {

	public static void main(String[] args) {
		int number = 12345;
		int expectedResult = calculateSum(number);
		while (expectedResult > 9) {
			expectedResult = calculateSum(expectedResult);
		}
		/**if (expectedResult > 9) {
			expectedResult = calculateSum(expectedResult);
		} **/
		System.out.println("Single digit by adding all the digits of a number repeatedly:" + expectedResult);

	}

	public static int calculateSum(int ans) {
		return Arrays.stream(String.valueOf(ans).split("")).mapToInt(Integer::parseInt).sum();
	}

}
