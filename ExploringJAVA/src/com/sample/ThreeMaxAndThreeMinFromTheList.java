package com.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxAndThreeMinFromTheList {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		getThreeMaxAndThreeMinFromTheList(listOfIntegers);
	}

	static void getThreeMaxAndThreeMinFromTheList(List<Integer> listOfIntegers) {
		System.out.println("1st 3 Minimum Value from List of Integers: ");
		listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
		System.out.println("1st 3 Maximum Value from List of Integers: ");
		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}

}
