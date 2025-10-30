package com.sample;

import java.util.Arrays;
import java.util.List;

public class PrintMultipliesOfFiveFromList {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		getPrintMultipliesOfFiveFromList(listOfIntegers);
	}

	static void getPrintMultipliesOfFiveFromList(List<Integer> listOfIntegers) {
		listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
	}

}
