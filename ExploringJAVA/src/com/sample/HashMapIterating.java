package com.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterating {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("I love to eat", "Apple");
		map.put("I love to have", "Banana");
		map.put("I love to drink", "Cola");
		getHadMapIterating(map);
	}

	static void getHadMapIterating(Map map) {
		map.computeIfPresent(("I love to eat"), (key, value) -> ("Briyani"));
		map.entrySet().iterator().forEachRemaining(System.out::println);
		map.computeIfAbsent("I like", (value) -> ("Dosa"));
		map.entrySet().iterator().forEachRemaining(System.out::println);

	}

}
