package com.sample;

public class PrintWord1000TimesWithoutLoop {

	public static void main(String[] args) {
		String s = "Java";
		printWord1000TimesWithoutLoop(s);
	}
	
	static void printWord1000TimesWithoutLoop(String s) {
		String str = "i";
		str = str.replaceAll("i", "iiiiiiiiiii");
		str = str.replaceAll("i", "iiiiiiiiiii");
		str = str.replaceAll("i", "iiiiiiiiii");
		str = str.replaceAll("i", s+"\n");
		System.out.println(str);
	}

}
