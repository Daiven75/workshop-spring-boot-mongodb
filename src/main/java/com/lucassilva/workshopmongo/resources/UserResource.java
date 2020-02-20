package com.lucassilva.workshopmongo.resources;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucassilva.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User priscila = new User("1", "Priscila vitória", "priscila@gmail.com");
		List<User> usersList = new ArrayList<>();
		usersList.add(priscila);
		return ResponseEntity.ok().body(usersList);
	}
}