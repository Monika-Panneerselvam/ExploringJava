package com.sample;

public class SwappingTwoStringWithoutUsingThirdString {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "SpringBoot";
		getSwappingTwoStringWithoutUsingThirdString(str1, str2);
	}
	
	static void getSwappingTwoStringWithoutUsingThirdString(String s1, String s2) {
		System.out.println("Before Swapping: s1: " +s1+ " , s2: " +s2);
		s1 = s1 + s2;
		s2 = s1.substring(0 , s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping: s1: " +s1+ " , s2: " +s2);
	}

}
