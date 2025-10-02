package com.sample;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(getNthValueOfFibonacci(9));
	}

	static int getNthValueOfFibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return getNthValueOfFibonacci(n - 1) + getNthValueOfFibonacci(n - 2);
		}

	}

}
