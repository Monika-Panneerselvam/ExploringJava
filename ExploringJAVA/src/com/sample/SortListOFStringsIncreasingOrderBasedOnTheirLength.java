package com.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOFStringsIncreasingOrderBasedOnTheirLength {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Spring", "SpringBoot", "Tibco", "Python", "Rust", "Go");
		getSortListOFStringsIncreasingOrderBasedOnTheirLength(listOfStrings);
	}

	static void getSortListOFStringsIncreasingOrderBasedOnTheirLength(List<String> listOfStrings) {
		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}

}
