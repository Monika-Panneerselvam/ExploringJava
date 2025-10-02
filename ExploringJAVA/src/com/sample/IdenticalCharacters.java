package com.sample;

import java.util.HashSet;

public class IdenticalCharacters {

	public static void main(String[] args) {
		String s1 = "aaa";
		String s2 = "abc";
		System.out.println(findStringHasIdenticalCharactersUsingHashSet(s1));
		System.out.println(findStringHasIdenticalCharactersUsingHashSet(s2));
		System.out.println(findStringHasIdenticalCharactersInTraditionalWay(s1));
	}

	static boolean findStringHasIdenticalCharactersUsingHashSet(String s) {
		HashSet<Character> set = new HashSet<>();
		for (Character ch : s.toCharArray()) {
			if (set.contains(ch)) {
				return true;
			} else {
				set.add(ch);
			}
		}
		return false;
	}

	static boolean findStringHasIdenticalCharactersInTraditionalWay(String s) {
		char first = s.charAt(0);
		for (Character ch : s.toCharArray()) {
			if (ch != first) {
				return false;
			}
		}
		return true;
	}

}
