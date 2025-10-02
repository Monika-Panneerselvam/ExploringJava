package com.sample;

public class Palindrome {

	public static void main(String[] args) {
		String s = "Madam";
		System.out.println("Is " + s + " Palindrome ? " + isPalindrome(s) + " using traditional way");
		System.out.println("Is " + s + " Palindrome ? " + isPalindromeUsingStringBuilder(s) + " using StringBuilder");
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

}
