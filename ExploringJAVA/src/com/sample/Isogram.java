package com.sample;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

	public static void main(String[] args) {

		System.out.println(isIsogram("java"));

	}

	static boolean isIsogram(String s) {
		//boolean isogram = true;
		char[] ch = s.toCharArray();
		Set<Character> chSet = new HashSet<Character>();
		for (Character c : ch) {
			if (chSet.contains(c)) {
				return false;
			} else {
				chSet.add(c);
			}
		}
		return true;
	}

}
