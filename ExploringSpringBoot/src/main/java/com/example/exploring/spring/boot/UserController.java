package com.example.exploring.spring.boot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserDaoService userDaoService;

	public UserController(UserDaoService userDaoService) {
		super();
		this.userDaoService = userDaoService;
	}

	@GetMapping("/GetDetails")
	String getValue() {
		return userDaoService.getMethodMapping();
	}

	@PostMapping("/EnterDetails")

	String insert(@RequestBody User user) {
		ArrayList<User> Data = new ArrayList<User>();
		Data.add(new User(user.Number, user.Name));
		for (User use : Data) {
			System.out.println(use.Name + " " + user.Number);
		}
		return "Data Inserted";

	}

}
