package com.sample;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(9);
		a.add(7);
		a.add(1);
		a.add(2);
		a.add(8);
		getRemoveDuplicatesFromArrayList(a);
	}

	static void getRemoveDuplicatesFromArrayList(ArrayList<Integer> a) {
		HashSet<Integer> obj = new HashSet<>(a);
		System.out.println(obj);
		/**for (int num : obj) {
			System.out.println(num);
		}**/
	}

}
