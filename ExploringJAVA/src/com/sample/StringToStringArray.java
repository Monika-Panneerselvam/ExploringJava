package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToStringArray {

	public static void main(String[] args) {
		String s = "12/345/6789";
		getStringOfArrayFromString(s);
		getListOfIntegerFromString(s);
	}

	static void getStringOfArrayFromString(String str) {
		String[] arr = null;
		arr = str.split("/");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void getListOfIntegerFromString(String str) {
		List<Integer> list = Arrays.stream(str.split("/")).mapToInt(Integer::parseInt).boxed()
				.collect(Collectors.toList());
		System.out.println("using streams: " +list);
	}

}
