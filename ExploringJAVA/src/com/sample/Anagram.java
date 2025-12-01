package com.sample;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "dog";
		String s2 = "god";
		isAnagram(s1, s2);
		isAnagramUsingStreams(s1, s2);
	}

	static void isAnagram(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Given Strings are Anagram");
		} else {
			System.out.println("Given Strings are not Anagram");
		}
	}

	static void isAnagramUsingStreams(String s1, String s2) {
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if (s1.equals(s2)) {
			System.out.println("Given Strings are Anagram Using Streams");
		} else {
			System.out.println("Given Strings are not Anagram Using Streams");
		}
	}
}
