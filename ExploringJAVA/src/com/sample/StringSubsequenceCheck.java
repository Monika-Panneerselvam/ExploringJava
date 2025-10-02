package com.sample;

public class StringSubsequenceCheck {

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "adbec"));
		System.out.println(isSubsequence("ajc", "abec"));
		System.out.println(isSubsequence("dog", "god"));
	}

	static boolean isSubsequence(String s1, String s2) {
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == s1.length();
	}

}
