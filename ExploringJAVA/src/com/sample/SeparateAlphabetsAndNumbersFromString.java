package com.sample;

public class SeparateAlphabetsAndNumbersFromString {

	public static void main(String[] args) {
		//String s = "Monika@1994!Panneerselvam";
		String s = "abcDe12fGh";
		separatedAlphabetsAndNumbersFromString(s);
	}
	
	static void separatedAlphabetsAndNumbersFromString(String s) {
		StringBuilder alpha = new StringBuilder();
		StringBuilder numeric = new StringBuilder();
		StringBuilder nonAlphaNumeric = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (Character.isLetter(ch)) {
				alpha.append(ch);
			} else if (Character.isDigit(ch)) {
				numeric.append(ch);
			} else {
				nonAlphaNumeric.append(ch);
			}
		}
		System.out.println("Alphabets from given String: " +alpha);
		System.out.println("Numbers from given String: " +numeric);
		System.out.println("Non-AlphaNumerics from given String: " +nonAlphaNumeric);
	}

}
