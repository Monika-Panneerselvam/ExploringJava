package com.sample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {

		String input = "jjjaabbbccccd";
		stringComperssion(input);
		characterCountUsingStream(input);
		characterCountNoChangingInputOrderCharacterFirstAndItsCountLast(input);
		characterCountNoChangingInputOrderCharacterCountFirstAndItsCharacterLast(input);
	}

	static void stringComperssion(String inputString) {
		// ASCII value from 97 to 122 -> small letters from a to z, getting ASCII value
		// for all the characters from given String input and converting the same into
		// int[] inputCodePoints
		int[] inputCodePoints = inputString.codePoints().toArray();
		StringBuilder characterCountBuilder = new StringBuilder();
		int count = 0;
		for (int i = 0; i < inputCodePoints.length; i++) {
			if (count == 0) {
				characterCountBuilder.appendCodePoint(inputCodePoints[i]);
			}
			if (i + 1 < inputCodePoints.length && inputCodePoints[i] != inputCodePoints[i + 1]) {
				count++;
				characterCountBuilder.append(count);
				count = 0;
			} else {
				count++;
			}
		}
		characterCountBuilder.append(count);
		System.out.println("String Compression : " + characterCountBuilder.toString());
	}

	static void characterCountUsingStream(String s) {
		System.out.println("Charater Count using Streams : "
				+ Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
						.entrySet().stream().collect(Collectors.toList()));
	}

	static void characterCountNoChangingInputOrderCharacterFirstAndItsCountLast(String s) {
		System.out.println("Charater Count using Streams With Input Order: " + Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().map(entry -> entry.getKey() + "" + entry.getValue())
				.collect(Collectors.joining()));
	}

	static void characterCountNoChangingInputOrderCharacterCountFirstAndItsCharacterLast(String s) {
		System.out.println("Charater Count using Streams With Input Order: " + Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().map(entry -> entry.getValue() + "" + entry.getKey())
				.collect(Collectors.joining()));
	}

}
