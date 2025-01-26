package com.example.mappings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
  //apis calls
	@GetMapping("/api/hello")
	public String hello() {
		return "hello mappings"; //returning string
	}

}