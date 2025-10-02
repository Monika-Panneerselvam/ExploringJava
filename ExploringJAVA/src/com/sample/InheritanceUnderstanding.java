package com.sample;

class Parent {
	int value = 10;
}

class Child extends Parent {
	int value = 20;
}

public class InheritanceUnderstanding {

	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		System.out.println(parent.value);
		System.out.println(child.value);
	}

}
