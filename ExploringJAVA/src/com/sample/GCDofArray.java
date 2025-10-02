package com.sample;

public class GCDofArray {

	public static void main(String[] args) {
		int[] num = { 24, 36, 60 };
		System.out.println("GCD of given Array: " + gcdOfArray(num));
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static int gcdOfArray(int[] arr) {
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = gcd(result, arr[i]);
		}
		return result;
	}

}
