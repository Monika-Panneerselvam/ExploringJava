package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeatElement {

	public static void main(String[] args) {
		String input = "iloveexploringjava";
		String result = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println("1st Non Repeat Element:" + result);

		List<String> allUniqueElements = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("All Unique Elements:" + allUniqueElements);

		List<String> nos = Arrays.asList("1", "2", "3", "4");
		List<String> role = List.of("admin", "users");
		String ans = String.join("-", nos);
		System.out.println(ans);
		System.out.println(String.join("&", role));

		IntStream.rangeClosed(1, 10).skip(4).limit(8).forEach(System.out::println);

		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		System.out.println(" <<>>   " +s1 == s2); // o/p is false
		System.out.println(" Is s1 == s2 ? " + (s1 == s2));
		System.out.println(" Is s1.equals(s3) ? " + s1.equals(s3));
		//System.out.println(" Is s1 == s3 ? " + (s1 == s3));
		//System.out.println(" Is s3.equals(s2) ? " + (s3.equals(s2)));
	}

}
