package com.sample;

public class ConvertingStringtoLowerAndUpperCase {

	public static void main(String[] args) {
		String str = "I love to eat Apple, I love to eat Bananas";
		String s = "StRiNg";
		convertingSentenceToLowerCaseAndUpperCase(str);
		convertingLowerCaseToUpperCaseAndViceVersaInString(s);
		convertingLowerCaseToUpperCaseAndViceVersaInStringUsingASCII(s);
		convertingLowerCaseToUpperCaseAndViceVersaInStringWithoutConvertingToCharArray(s);
	}

	static void convertingSentenceToLowerCaseAndUpperCase(String s) {
		int mid = s.length() / 2;
		String lowerCase = "";
		String upperCase = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < mid) {
				lowerCase = lowerCase + Character.toLowerCase(s.charAt(i));
			} else {
				upperCase = upperCase + Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(lowerCase + upperCase);
	}

	static void convertingLowerCaseToUpperCaseAndViceVersaInString(String str) {
		char[] chArrayFromString = str.toCharArray();
		StringBuilder obj = new StringBuilder();
		for (int i = 0; i < chArrayFromString.length; i++) {
			if (Character.isUpperCase(chArrayFromString[i])) {
				obj.append(Character.toLowerCase(chArrayFromString[i]));
			} else if (Character.isLowerCase(chArrayFromString[i])) {
				obj.append(Character.toUpperCase(chArrayFromString[i]));
			} else {
				obj.append(chArrayFromString[i]);
			}
		}
		System.out.println("Converted UpperCase To LowerCase & Viceversa of given String: " + obj);
	}

	static void convertingLowerCaseToUpperCaseAndViceVersaInStringUsingASCII(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int ascii = (int) ch;
			//ASCII value from 65 to 90 -> capital letters from A to Z
			if (ascii >= 65 && ascii <= 90) {
				ascii += 32;
			} //ASCII value from 97 to 122 -> small letters from a to z 
			else if (ascii >= 97 && ascii <= 122) {
				ascii -= 32;
			}
			result += (char) ascii;
		}
		System.out.println("Converted UpperCase To LowerCase & Viceversa of given String using ASCII: " + result);
	}
	
	static void convertingLowerCaseToUpperCaseAndViceVersaInStringWithoutConvertingToCharArray(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				sb.append(Character.toLowerCase(str.charAt(i)));
			} else if (Character.isLowerCase(str.charAt(i))) {
				sb.append(Character.toUpperCase(str.charAt(i)));
			} else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
