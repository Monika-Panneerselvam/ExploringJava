package com.sample;

import java.util.Objects;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}

public class HashCodeAndEqualsUnderstanding {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Dog");
		Student s2 = new Student(2, "Cat");
		Student s3 = new Student(1, "Dog");

		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));

		System.out.println("HashCode of s1: " + s1.hashCode());
		System.out.println("HashCode of s2: " + s2.hashCode());
		System.out.println("HashCode of s3: " + s3.hashCode());
	}

}
