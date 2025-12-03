package com.sample.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class Person {

	private final String name;
	private final LocalDate dateOfBirth;
	private final Date dateOfJoining;
	private final List<String> address;

	public Person(String name, LocalDate dateOfBirth, Date dateOfJoining, List<String> address) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = new Date(dateOfJoining.getTime());
		this.address = Collections.unmodifiableList(new ArrayList<>(address));
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Date getDateOfJoining() {
		return new Date(dateOfJoining.getTime());
	}

	public List<String> getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + ", dateOfJoining=" + dateOfJoining
				+ ", address=" + address + "]";
	}

}
