package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotatingList {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("SpringBoot");
		myList.add("SpringMVC");
		myList.add("Spring");
		System.out.println("Original List:" + myList);
		Collections.rotate(myList, 1);
		System.out.println("Rotated List:" + myList);
		getRotatedArray();
	}

	static void getRotatedArray() {
		Integer[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array:" + Arrays.toString(arr));
		Collections.rotate(Arrays.asList(arr), 2);
		System.out.println("Rotated Array:" + Arrays.toString(arr));
	}

}
