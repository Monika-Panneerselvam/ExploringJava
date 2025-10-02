package com.sample;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {

	public static void main(String[] args) {
		System.out.println(isPangram("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(isPangram("java"));
	}

	static boolean isPangram(String str) {
		Set<Character> set = new HashSet<>();
		str = str.toLowerCase();
		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				set.add(ch);
			}
		}
		return 26 == set.size();
	}

}
