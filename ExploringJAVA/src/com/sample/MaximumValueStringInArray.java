package com.sample;

import java.util.Arrays;

public class MaximumValueStringInArray {

	public static void main(String[] args) {
		String[] obj = { "Java", "Scala", "K8s", "Docker", "Java21" };
		String[] str = { "Java", "123", "4567", "000000" };
		String result = Arrays.stream(obj).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();
		System.out.println("Longest Word using reduce:" + result);
		System.out.println("Length of Longest Word:" + result.length());

		String res = Arrays.stream(str).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println("Longest Word using reduce:" + res);
		System.out.println("Length of Longest Word:" + res.length());

		int maxLength = Arrays.stream(obj).mapToInt(string -> string.length()).max().orElse(0);
		System.out.println("Length of Longest Word using mapToInt:" + maxLength);

		getMaximumValueStringInArray(obj);
	}

	static void getMaximumValueStringInArray(String[] strings) {
		int[] valuesOfStrings = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			String currentString = strings[i];// .replaceAll("\\d", "");
			if (currentString.isEmpty()) {
				valuesOfStrings[i] = Integer.parseInt(strings[i]);
			} else {
				valuesOfStrings[i] = strings[i].length();

			}
		}

		Arrays.sort(valuesOfStrings);
		System.out.println(
				"Length Of Longest Value String in an Array by converting String of Array to int of Array and calculating its length using sort: "
						+ valuesOfStrings[valuesOfStrings.length - 1]);
		int maxValue = Arrays.stream(valuesOfStrings).max().getAsInt();
		System.out.println(
				"Length Of Longest Value String in an Array by converting String of Array to int of Array and calculating its length using Stream: "
						+ maxValue);
	}

}
