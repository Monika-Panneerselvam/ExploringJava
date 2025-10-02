package com.sample;

import java.util.List;

public class TraverseList {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 5, 7, 3, 4, 10, 23);
		getTraverseList(list);
	}

	static void getTraverseList(List<Integer> numList) {
		numList.forEach(ele -> System.out.println(ele));
	}
}
