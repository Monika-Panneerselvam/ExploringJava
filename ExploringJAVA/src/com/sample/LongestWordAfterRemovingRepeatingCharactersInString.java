package com.sample;

import java.util.HashSet;
import java.util.stream.Collectors;

public class LongestWordAfterRemovingRepeatingCharactersInString {

	public static void main(String[] args) {
		String s = "abbcccdddd";
		longestWordAfterRemovingRepeatingCharactersInString(s);
		longestWordAfterRemovingRepeatingCharactersInStringUsingStream(s);
	}

	static void longestWordAfterRemovingRepeatingCharactersInString(String s) {
		HashSet<Character> set = new HashSet<>();
		char[] chArray = s.toCharArray();
		for (char ch : chArray) {
			set.add(ch);
		}
		StringBuilder strBuilder = new StringBuilder();
		for (Character c : set) {
			strBuilder.append(c);
		}
		System.out.println("Removed Repeated characters from String & its Length using set.size() : " + set.size());
		System.out
				.println("Removed Repeated characters from String using Set & StringBuilder: " + strBuilder.toString());
		System.out.println("Removed Repeated characters from String & its Length by converting set to StringBuilder : "
				+ strBuilder.toString().length());

	}

	static void longestWordAfterRemovingRepeatingCharactersInStringUsingStream(String s) {
		String result = s.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println("Removed Repeated characters from String using stream: " + result);
		System.out.println("Removed Repeated characters from String's Length using stream: " + result.length());
	}

}
