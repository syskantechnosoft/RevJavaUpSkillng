package com.revature.firstwebservice.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	
	@RequestMapping("/hello")
	public String welcome () {
		return "Welome to Spring Boot World!!!";
	}

	@RequestMapping("/Welcome")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/sampleGet")
	public String getMap() {
		return "This is a Get method sample";
	}
	
	@PostMapping("/sampleGet")
	public String postMap() {
		return "This is a Post method sample";
	}
	
	@PutMapping("/sampleGet")
	public String putMap() {
		return "This is a put method sample";
	}
	@DeleteMapping("/sampleGet")
	public String deleteMap() {
		return "This is a delete method sample";
	}
}
