package com.luangustadev.curso.spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luangustadev.curso.spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class userResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		 User user = new User(1L, "Luan", "luan@gmail.com", "999999999", "senha123");
		 return ResponseEntity.ok().body(user);
	}
}
