package com.sample;

import java.util.Arrays;

public class TotalWordCountInStatement {

	public static void main(String[] args) {
		String str = "Java is programming Language and Java is platform independent";
		countNumberOfWordsInString(str);
		countNumberOfWordsAndWhiteSpaceUsingStreams(str);
	}

	// Total Word Count in the given String
	static void countNumberOfWordsInString(String s) {
		int count = 1;
		if (s.isEmpty()) {
			System.out.println("String is Empty");
		} else {
			for (int i = 0; i < s.length() - 1; i++) {
				if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
					count++;
				}
			}
			System.out.println("Number Of words in a String: " + count);
		}
	}

	// Total Word Count in the given String using stream
	static void countNumberOfWordsAndWhiteSpaceUsingStreams(String s) {
		System.out.println("Counting words in the given String using stream: "
				+ Arrays.stream(s.trim().split("\s+")).filter(word -> !word.isEmpty()).count());
		System.out.println(
				"Counting Whitespace in the given String using stream: " + s.chars().filter(ch -> ch == ' ').count());
	}

}
