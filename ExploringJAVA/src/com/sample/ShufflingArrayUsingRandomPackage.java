package com.sample;

import java.util.Arrays;
import java.util.Random;

public class ShufflingArrayUsingRandomPackage {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		getShuffledArray(array);
		
		Random random = new Random();
        int randomNumber = random.nextInt(); // Generates any random integer
        System.out.println("Random Integer: " + randomNumber);
	}

	static void getShuffledArray(int[] array) {
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}

		System.out.println(Arrays.toString(array));

	}

}
