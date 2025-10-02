package com.sample;

public class LongestSubstring {

	public static void main(String[] args) {
		String s = "abcDe12fGhijk34lmnopQRS";
		System.out.println("LongestSubString: " + findSubstring(s));
	}

	static String findSubstring(String s) {
		String longest = "";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (Character.isDigit(s.charAt(i)))
				continue;
			for (int j = i + 1; j <= n; j++) {
				String sub = s.substring(i, j);
				if (!sub.matches(".*\\d.*") && sub.matches(".*[A-Z].*")) {
					if (sub.length() > longest.length()) {
						longest = sub;
					}
				}
			}
		}
		return longest;
	}

}
