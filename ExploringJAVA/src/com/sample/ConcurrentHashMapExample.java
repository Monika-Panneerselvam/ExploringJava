package com.sample;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap<>();
		hashMap.put(1, 1);
		hashMap.put(2, 2);
		hashMap.put(3, 3);

		Iterator<Integer> it = hashMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("Value: " + hashMap.get(key));
			if (key.equals(2)) {
				hashMap.put(4, 4);
			}
		}
	}

}
