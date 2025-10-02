package com.sample;

class AreaOverload {

	void getArea(int r) {

		double pi = 22 / 7;

		System.out.println("Area of circle:" + pi * r * r);
	}

	void getArea(int l, int w) {

		System.out.println("Area of Reactangle:" + l * w);
	}
}

class Area {

	public static void main(String[] args) {

		AreaOverload aol = new AreaOverload();
		aol.getArea(2);
		aol.getArea(2, 4);

	}
}
