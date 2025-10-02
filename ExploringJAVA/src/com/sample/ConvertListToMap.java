package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
	String username;
	String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
}

public class ConvertListToMap {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(new User("1", "123"), new User("2", "xyz"), new User("3", "abc"),
				new User("1", "123"));
		Map<String, String> userMap = users.stream()
				.collect(Collectors.toMap(User::getUsername, User::getPassword, (exsisting, duplicate) -> exsisting));
		System.out.println(userMap);

	}

}
