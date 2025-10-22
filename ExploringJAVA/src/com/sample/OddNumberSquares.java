package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberSquares {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		getOddNumberSquares(num);
	}

	static void getOddNumberSquares(List<Integer> num) {
		List<Integer> oddSquares = num.stream().filter(n -> n % 2 != 0).map(n -> n * n).collect(Collectors.toList());
		System.out.println("Squares of odd numbers from List of Integers: " + oddSquares);
	}

}
