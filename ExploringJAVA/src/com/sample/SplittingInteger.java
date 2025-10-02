package com.sample;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SplittingInteger {

	public static void main(String[] args) {
		getSplittingInteger();
	}

	static void getSplittingInteger() {
		DecimalFormat f = new DecimalFormat();
		DecimalFormatSymbols fs = f.getDecimalFormatSymbols();
		fs.setGroupingSeparator('.');
		f.setDecimalFormatSymbols(fs);
		String s = f.format(123456789);
		System.out.println(s);
		System.out.println(s.replace(".", ","));
	}

}
