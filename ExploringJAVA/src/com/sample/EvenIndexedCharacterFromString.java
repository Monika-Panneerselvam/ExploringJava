package com.sample;

public class EvenIndexedCharacterFromString {

	public static void main(String[] args) {
		String s = "Exploring Java";
		getEvenIndexedCharacterFromString(s);
	}
	
	static void getEvenIndexedCharacterFromString(String s) {
		for (int i=0; i<s.length() ; i++) {
			if (i%2 == 0) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
