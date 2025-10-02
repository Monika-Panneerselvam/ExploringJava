package com.sample;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReversingString {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter a string: ");
		// String s = scanner.nextLine();
		getReversedString("dog");
		getReverseEachWordInStatetmentOfString("I Love Expolring Java");
		getReverseEachWordInStatetmentOfStringUsingStreams("I Love Expolring Java");
	}

	static void getReversedString(String s) {
		/**
		 * char ch; String str = ""; for (int i = 0; i<s.length(); i++) { ch =
		 * s.charAt(i); str = ch + str; } System.out.println("Reversed String: " +str);
		 **/
		// char[] chArrayFromString = s.toCharArray();
		StringBuilder result = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			result = result.append(s.charAt(i));
		}
		System.out.println("Reversed String: " + result);
	}

	static void getReverseEachWordInStatetmentOfString(String s) {
		String[] words = s.split(" ");
		StringBuilder strBuilder = new StringBuilder();
		/**
		 * for (int i = 0; i < words.length; i++) { String word = words[i]; String str =
		 * ""; char ch; for (int j = 0; j < word.length(); j++) { ch = word.charAt(j);
		 * str = ch + str; } reverseString = reverseString + str + " "; }
		 **/
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				strBuilder = strBuilder.append(word.charAt(i));
			}
			strBuilder = strBuilder.append(" ");
		}
		System.out.println("Input String: " + s);
		System.out.println("Reversed Each Word In String: " + strBuilder);
	}

	static void getReverseEachWordInStatetmentOfStringUsingStreams(String str) {
		String s = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println("Reversed Each Word In String Using Streams:  " + s);
	}

}
