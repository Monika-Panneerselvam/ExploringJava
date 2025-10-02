package com.sample;

public class SwappingTwoValuesWithoutUsingTemp {

	public static void main(String[] args) {
		getSwappingTwoValuesWithoutUsingTemp(1 , 2);		
	}
	
	static void getSwappingTwoValuesWithoutUsingTemp(int a, int b) {
		System.out.println("Before Swapping: " +a+ " , " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping: " +a+ " , "  +b);
	}
}
