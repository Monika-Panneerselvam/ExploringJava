package com.sample;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.sample.model.Person;

public class UnderstandingImmutableClass {

	public static void main(String[] args) {
		String name = "Akshay";
		LocalDate dateOfBirth = LocalDate.of(2021, 07, 04);
		Date dateOfJoining = new Date();
		// LocalDate doj = LocalDate.of(2023, 12, 4);
		// Date dateOfJoining =
		// Date.from(doj.atStartOfDay(ZoneId.systemDefault()).toInstant());
		List<String> address = Arrays.asList("Apartment", "Galway", "Ireland");

		Person person = new Person(name, dateOfBirth, dateOfJoining, address);
		System.out.println(person);
		
	}

}
