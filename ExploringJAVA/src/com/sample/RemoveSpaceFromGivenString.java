package com.sample;

public class RemoveSpaceFromGivenString {

	public static void main(String[] args) {
		String s = "I love exploring Java";
		getRemoveSpaceFromGivenString(s);
		getRemoveSpaceFromGivenStringUsingStringBuilder(s);
	}
	
	static void getRemoveSpaceFromGivenString(String s) {
		System.out.println("Before removing Space from the given String: " +s);
		s = s.replace(" " , "");
		System.out.println("After removing Space from the given String: " +s);
	}
	
	static void getRemoveSpaceFromGivenStringUsingStringBuilder(String s) {
		StringBuilder str = new StringBuilder();
		for (int i=0 ; i <s.length(); i++) {
			if (s.charAt(i) != ' ') {
				str = str.append(s.charAt(i));
			}
		}
		System.out.println("After removing space using StringBuilder: " +str.toString());
	}

}
