package com.sample;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		String s = "Madam";
		System.out.println("Is " + s + " Palindrome ? " + isPalindrome(s) + " using traditional way");
		System.out.println("Is " + s + " Palindrome ? " + isPalindromeUsingStringBuilder(s) + " using StringBuilder");
		System.out.println("Is " + s + " Palindrome ? " + isPalindromeUsingStreams(s) + " using Streams");
	}

	static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	static boolean isPalindromeUsingStringBuilder(String str) {
		if (str == null) {
			return false;
		}
		str = str.toLowerCase();
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	static boolean isPalindromeUsingStreams(String str) {
		String s = str.toLowerCase();
		return IntStream.range(0, s.length() / 2).allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
	}

}
