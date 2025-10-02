package com.sample;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 3;
		System.out.println("Is " + n + " Prime Number ? " + isPrimeNumber(n));
	}

	static boolean isPrimeNumber(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
