package com.sample;

public class CountVowelsAndConsonantsInString {

	public static void main(String[] args) {
		String s = "Exploring Java";
		getCountVowelsAndConsonantsInString(s);
		System.out.println("Does given String contains vowels? " +isGivenStringContainsVowels(s));
	}

	static void getCountVowelsAndConsonantsInString(String str) {
		int vowels = 0;
		int consonants = 0;
		str = str.toLowerCase();
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}

	static boolean isGivenStringContainsVowels(String s) {
		if (s.toLowerCase().matches(".*[aeiou]*.")) {
			return true;
		}
		return false;
	}

}
