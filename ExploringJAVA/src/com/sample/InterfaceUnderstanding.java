package com.sample;

interface InterfaceUnderstandingExample {
	void understandingAsbractMethod();

	default void understandingDefaultMethod() {
		System.out.println("Inside Default Method");
	}

	static void understandingStaticMethod() {
		System.out.println("Inside Static Method");
	}

}

class InterfaceUnderstandingExampleClass implements InterfaceUnderstandingExample {
	public void understandingAsbractMethod() {
		System.out.println("Inside Abstract Method");
	}
}

public class InterfaceUnderstanding {

	public static void main(String[] args) {
		InterfaceUnderstandingExampleClass interfaceUnderstandingExampleClass = new InterfaceUnderstandingExampleClass();
		interfaceUnderstandingExampleClass.understandingAsbractMethod();
		interfaceUnderstandingExampleClass.understandingDefaultMethod();
		InterfaceUnderstandingExample.understandingStaticMethod();
	}

}
