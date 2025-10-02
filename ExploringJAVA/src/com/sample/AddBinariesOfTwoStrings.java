package com.sample;

public class AddBinariesOfTwoStrings {

	public static void main(String[] args) {

		String s1 = "Spring";
		String s2 = "Boot";
		System.out.println("Added Binaries Of 2 Strings: " + addBinary(s1, s2));
	}

	static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0 || carry == 1) {
			int sum = carry;
			if (i >= 0) {
				sum = sum + a.charAt(i) - '0';
				i--;
			}
			if (j >= 0) {
				sum = sum + b.charAt(j) - '0';
				j--;
			}
			sb.append(sum % 2);
			carry = sum / 2;
		}
		return sb.reverse().toString();
	}
}
