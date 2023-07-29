package com.greatlearning.cfsr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collegeFest")
public class StudentController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "<h1>Welcomr</h1>";
	}
}
