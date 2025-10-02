package com.sample;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "dog";
		String s2 = "god";
		isAnagram(s1, s2);
	}
	
	static void isAnagram(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Given Strings are Anagram");
		} else {
			System.out.println("Given Strings are not Anagram");
		}
	}
}
