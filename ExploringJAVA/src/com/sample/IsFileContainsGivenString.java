package com.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IsFileContainsGivenString {

	public static void main(String[] args) {
		try {
			System.out.println(isFileContainsString("C:\\Users\\mdhin\\Desktop\\testing.txt\\", "testing"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File Not Found Exception");
		}

	}

	static boolean isFileContainsString(String filePath, String str) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains(str)) {
				scanner.close();
				return true;
			}
		}
		scanner.close();
		return false;
	}

}
