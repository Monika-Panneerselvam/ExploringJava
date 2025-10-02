package com.sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TraverseHashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Spring Boot");
		set.add("Microservice");
		traversingHashSet(set);
	}

	static void traversingHashSet(Set<String> set) {
		// Using forEach
		set.forEach(ele -> System.out.println(ele));

		// Using Iterator Interface
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
