package com.sample;

public class ConstructorTesting {

	ConstructorTesting() {
		System.out.println("Inside Constructor");
	}

	void method() {
		System.out.println("Inside Method");
	}

	{
		System.out.println("Instance block");
	}

	static void methodStatic() {
		System.out.println("Static block with method name");
	}

	static {
		System.out.println("Static block without method name");
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		new ConstructorTesting().method();
		methodStatic();
	}

}
