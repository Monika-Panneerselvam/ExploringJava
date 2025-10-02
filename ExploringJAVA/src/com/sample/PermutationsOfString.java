package com.sample;

public class PermutationsOfString {

	public static void main(String[] args) {
		String s = "abc";
		permute(s, "");
	}

	static void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String s = str.substring(0, i) + str.substring(i + 1);
				permute(s, prefix + str.charAt(i));
			}
		}
	}
}
