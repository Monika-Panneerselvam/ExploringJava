package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnderstandingStartsWithFunctionInStream {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 26 };
		List<String> ans = Arrays.stream(num).boxed().map(s -> s + "").filter(s -> s.startsWith("2"))
				.collect(Collectors.toList());
		System.out.println(ans);

		List<String> str = List.of("anna", "mam", "sir");
		List<String> res = str.stream().filter(word -> word.length() > 1).filter(word -> {
			char first = Character.toLowerCase(word.charAt(0));
			char last = Character.toLowerCase(word.charAt(word.length() - 1));
			return first == last;
		}).collect(Collectors.toList());
		System.out.println("List of Words from List<String> has same First & Last Character: " + res);

		String s = "anna alice madam";
		List<String> result = Arrays.stream(s.split("\\s+")).filter(word -> word.length() > 1).filter(word -> {
			char first = Character.toLowerCase(word.charAt(0));
			char last = Character.toLowerCase(word.charAt(word.length() - 1));
			return first == last;
		}).collect(Collectors.toList());
		System.out.println("List of Words from String has same First & Last Character: " + result);
	}

}
