package com.sample;

public class DoubleEachCharactersInString {

	public static void main(String[] args) {
		String s = "JAVA";
		getDoubleEachCharactersInString(s);
	}
	
	static void getDoubleEachCharactersInString(String s) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i<s.length(); i++) {
			str = str.append(s.charAt(i)).append(s.charAt(i));
		}
		System.out.println("Doubled Each Cahracter: " +str.toString());
	}

}
