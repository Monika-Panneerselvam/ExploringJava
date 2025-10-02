package com.sample;

public class CustomException {

	class MyException extends Exception {
		public MyException(String s) {
			super(s);
		}
	}

	public static void main(String[] args) throws MyException {
		System.out.println("Inside Main Class");
	}

}
