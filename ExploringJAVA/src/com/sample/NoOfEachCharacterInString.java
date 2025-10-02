package com.sample;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfEachCharacterInString {

	public static void main(String[] args) {
		String input = "iloveexploringjava";
		Map<String, Long> map = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

	}

}