package com.sample;

public class CubeAndSquareRoot {

	public static void main(String[] args) {
		getCubeRoot(27);
		getSquareRoot(4);
	}

	static void getCubeRoot(int a) {
		System.out.println("Cube Root:" + Math.cbrt(a));
	}

	static void getSquareRoot(int b) {
		System.out.println("Square Root:" + Math.sqrt(b));
	}

}
