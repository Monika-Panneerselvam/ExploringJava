package com.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergingList {

	public static void main(String[] args) {
		List<String> list1 = List.of("1", "4", "5", "0");
		List<String> list2 = List.of("2", "3");
		mergingList(list1, list2);
		getSortListInReverseOrder(list1);
	}

	static void mergingList(List<String> l1, List<String> l2) {
		List<String> mergedList = new ArrayList<>(l1);
		mergedList.addAll(l2);
		System.out.println(mergedList);
	}

	static void getSortListInReverseOrder(List<String> list) {
		System.out.println("Sorted the List In Reverse Order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
