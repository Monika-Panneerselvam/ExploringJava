package com.sample;

public class ExceptionUnderstanding {

	public static void main(String[] args) {
		int x = 10 * 10 - 10;
		System.out.println(x);
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		exception(false);
	}

	static void exception(boolean flag) {
		try {
			if (flag) {
				while (true) {
					System.out.println("Inside if & while block");
					System.exit(0);
				}
			} else {
				System.out.println("Inside else block");
				System.exit(1);
			}
		} finally {
			System.out.println("Inside finally block");
		}
	}

}
