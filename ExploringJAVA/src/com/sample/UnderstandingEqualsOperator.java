package com.sample;

public class UnderstandingEqualsOperator {

	public static void main(String[] args) {
		boolean a=false;
		if (a = true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		String str1 = new String("abc");
		String str2 = "abc";
		System.out.println(str2.compareTo(str1)); //if both strings are equal returns 0

		if (str1 == str2) {
			System.out.println(str1 + " == " + str2);
		} else {
			System.out.println(str1 + " != " + str2);
		}

	}

}
