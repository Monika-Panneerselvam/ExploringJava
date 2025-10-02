package com.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateFormatUnderstaning {

	public static void main(String[] args) {
		// E denotes day name (ex: Monday)
		// dd denotes day
		// MMM denotes 1st 3 letters of Month name (ex: Jul)
		// yyyy denotes year
		// HH denotes hours
		// mm denotes minutes
		// ss denotes seconds
		// z denotes TimeZone
		System.out.println("Today's Date: " + simpleDateFormatToPrintCurrentDate("E, dd MMM yyyy HH:mm:ss z"));
		try {
			convertingDatePattern("dd MM yyyy HH:mm:ss z", "E, dd MMM yyyy HH:mm:ss z",
					simpleDateFormatToPrintCurrentDate("dd MM yyyy HH:mm:ss z"));
		} catch (ParseException | DateTimeParseException e) {
			e.printStackTrace();
		}
	}

	static String simpleDateFormatToPrintCurrentDate(String pattern) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(new Date()); // new Date() returns Current Date as String
	}

	// To convert dd MMM yyyy HH:mm:ss z to E, dd MMM yyyy HH:mm:ss z
	static void convertingDatePattern(String inputPattern, String outputPattern, String currentDate)
			throws ParseException, DateTimeParseException {
		SimpleDateFormat inputSimpleDateFormat = new SimpleDateFormat(inputPattern);
		SimpleDateFormat outputSimpleDateFormat = new SimpleDateFormat(outputPattern);

		Date date = inputSimpleDateFormat.parse(currentDate);
		String formattedDate = outputSimpleDateFormat.format(date);

		System.out.println("Using Parse Method from Date : " + formattedDate);

		//Java 8+ , we are using DateTimeFormatter and its thread-safe
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm:ss z");
		LocalDate localDate = LocalDate.parse(currentDate, formatter);
		System.out.println("Using Parse Method from DateTimeFormatter : " + localDate);
	}

}
