package com.sample;

@FunctionalInterface
interface ArithmeticOperations {
	int calculate(int x);
}

public class FunctionalInterfaceUnderstanding {

	public static void main(String[] args) {
		int a = 5;
		ArithmeticOperations adding = (int x) -> x + x;
		ArithmeticOperations multiplying = (int x) -> x * x;
		ArithmeticOperations dividing = (int x) -> x / x;
		int add = adding.calculate(a);
		int multiply = multiplying.calculate(a);
		int divide = dividing.calculate(a);
		System.out.println("Sum: " + add);
		System.out.println("Multiply: " + multiply);
		System.out.println("Divide: " + divide);
	}

}
