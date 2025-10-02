package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingListAndArrayList {

	public static void main(String[] args) {
		getReversedList();
		getReversedArrayList();
	}
	
	static void getReversedList() {
		List<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("Spring");
		myList.add("SpringMVC");
		myList.add("SpringBoot");
		System.out.println("Original List:" +myList);
		Collections.reverse(myList);
		System.out.println("Reversed List:" +myList);
	}
	
	static void getReversedArrayList() {
		Integer[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println("Original Array List:" +Arrays.toString(arr));
		Collections.reverse(Arrays.asList(arr));
		System.out.println("Reversed Array List:" +Arrays.toString(arr));
	}

}
