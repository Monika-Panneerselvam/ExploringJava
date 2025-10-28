package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveBlankNullEmptyFromArraysOfString {

	public static void main(String[] args) {

		String[] input = { "Java", "", " ", null, "Spring", "SpringBoot" };
		getRemoveBlankNullEmptyFromArraysOfString(input);
		// TODO Auto-generated method stub

	}

	static void getRemoveBlankNullEmptyFromArraysOfString(String[] arr) {
		String[] result = Arrays.stream(arr).filter(Objects::nonNull).filter(s -> !s.isBlank()).toArray(String[]::new);
		List<String> res = Arrays.stream(arr).filter(Objects::nonNull).filter(s -> !s.isBlank())
				.collect(Collectors.toList());
		System.out.println("Removed blank, null & empty from String of Array: " + Arrays.toString(result));
		System.out.println("Removed blank, null & empty from String of Array: " + res);
	}

}
