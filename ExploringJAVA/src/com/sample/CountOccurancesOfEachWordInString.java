package com.sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesOfEachWordInString {

	public static void main(String[] args) {
		String str = "Java is programming Language and Java is platform independent";
		countOccurancesOfEachWordInString(str);
	}
	
	static void countOccurancesOfEachWordInString(String str) {
		// Word Count Using Stream
		System.out.println("Word Count using Streams in String:" + Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.collect(Collectors.toList()));

		// Word Count Without Using Stream
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		for (String s : str.split(" ")) {
			if (wordCountMap.containsKey(s)) {
				wordCountMap.put(s, wordCountMap.get(s) + 1);
			} else {
				wordCountMap.put(s, 1);
			}
		}
		System.out.println("Word Count using HashMap in String:" + wordCountMap);
	}

}
